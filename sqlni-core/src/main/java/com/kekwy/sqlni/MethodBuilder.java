package com.kekwy.sqlni;

import com.kekwy.sqlni.node.ElementNode;
import com.kekwy.sqlni.node.Node;
import com.kekwy.sqlni.node.TextNode;
import com.kekwy.sqlni.parser.SQLNIBaseVisitor;
import com.kekwy.sqlni.parser.SQLNIParser;
import com.kekwy.sqlni.templates.MySQLTemplates;
import com.kekwy.sqlni.templates.SQLTemplates;
import com.kekwy.sqlni.util.ParserUtil;
import com.kekwy.sqlni.util.TemplatesUtil;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.kekwy.sqlni.util.TemplatesUtil.*;

/**
 * MethodBuilder
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/18 9:49
 */
@SuppressWarnings("UnusedReturnValue")
public class MethodBuilder {

    private final String id;

    private String resultType = "java.lang.Object";

    private String resultMap;

    private String statement;

    public MethodBuilder(String id) {
        this.id = id;
    }

    public MethodBuilder resultType(String resultType) {
        this.resultType = parseResultType(resultType);
        return this;
    }

    public MethodBuilder resultMap(String resultMap) {
        this.resultMap = resultMap;
        return this;
    }

    public MethodBuilder statement(String statement) {
        this.statement = statement;
        return this;
    }

    public ElementNode build() {
        ParseTree root = ParserUtil.parseFromString(statement);
        return new SQLNIVisitor().visit(root, Map.of(
                NAME_ID, id,
                NAME_RESULT_TYPE, resultType
        ));
    }

    /* CONSTANT: pattern
     * --------------------------------------------------------------------------------------------------------- */
    private static final Pattern RESULT_TYPE_PATTERN = Pattern.compile(".+<(.+)>");

    /**
     * 当用户编写的方法返回值类型为集合时，解析出集合中元素的类型，作为 resultType
     *
     * @param resultType Mapper 接口中方法的返回值类型
     * @return 可以被 Mybatis 识别的 resultType
     */
    private String parseResultType(String resultType) {
        Matcher matcher = RESULT_TYPE_PATTERN.matcher(resultType);
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return resultType;
        }
    }

    /* 静态常量
     * --------------------------------------------------------------------------------------------------------- */
    private static final String NAME_ID = "id";

    private static final String NAME_RESULT_TYPE = "resultType";

    private static final String TAG_SELECT = "select";


    private class SQLNIVisitor extends SQLNIBaseVisitor<List<Node>> {

//    private final Stack<ElementNode> nodeStack = new Stack<>();

        public ElementNode visit(ParseTree tree, Map<String, String> attributes) {
            ElementNode node = (ElementNode) super.visit(tree).get(0);
            node.addAttributes(attributes);
            return node;
        }


        @Override
        public List<Node> visitSelect(SQLNIParser.SelectContext ctx) {
            ElementNode selectNode = new ElementNode(TAG_SELECT);
            selectNode.addTextWithoutSpace(select());     // select
            /* distinct */
            if (ctx.DISTINCT() != null) {
                selectNode.addText(distinct());
            }
            if (ctx.columns() != null) {
                selectNode.addNodes(visit(ctx.columns()));    // select columns
            } else {
                selectNode.addText("*");
            }
            selectNode.addText(from()); // select columns from
            selectNode.addNodes(visit(ctx.table()));      // select columns from table
            /*  where   */
            if (ctx.WHERE() != null) {
                selectNode.addText(where());
                selectNode.addNodes(visit(ctx.conditions()));
            }
            /*  limit   */
            if (ctx.limit() != null) {
                selectNode.addNode(new TextNode(" "));
                selectNode.addNodes(visit(ctx.limit()));
            }
            return List.of(selectNode);
        }

        private List<Node> textOf(String text) {
            return List.of(new TextNode(text));
        }


        /* visit limit
         * --------------------------------------------------------------------------------------------------------- */

        @Override
        public List<Node> visitLimit(SQLNIParser.LimitContext ctx) {
            if (ctx.OFFSET() != null) {
                return limit(ctx.NUMBER(0).getText(), ctx.NUMBER(1).getText());
            } else {
                return limit(ctx.NUMBER(0).getText());
            }
        }


        /* visit column
         * --------------------------------------------------------------------------------------------------------- */

        @Override
        public List<Node> visitColumns(SQLNIParser.ColumnsContext ctx) {
            List<Node> nodes = new ArrayList<>(textOf(" "));
            List<SQLNIParser.ColumnContext> columnContexts = ctx.column();  // column1
            nodes.addAll(visit(columnContexts.get(0)));
            for (int i = 1; i < columnContexts.size(); i++) {
                nodes.addAll(textOf(", "));                                 // column1,
                nodes.addAll(visit(columnContexts.get(i)));                 // column1, column2
            }                                                               // column1, column2, ..., columnN
            return nodes;
        }

        @Override
        public List<Node> visitNormalColumn(SQLNIParser.NormalColumnContext ctx) {
            return textOf(ctx.getText());
        }

        @Override
        public List<Node> visitParamColumn(SQLNIParser.ParamColumnContext ctx) {
            visit(ctx.param());
            return textOf(ctx.getText());
        }

        @Override
        public List<Node> visitFuncColumn(SQLNIParser.FuncColumnContext ctx) {
            String func = ctx.ID().getText();
            List<Node> columns = new LinkedList<>();
            List<SQLNIParser.ColumnContext> columnCtxList = ctx.column();
            for (SQLNIParser.ColumnContext columnCtx : columnCtxList) {
                columns.addAll(visit(columnCtx));
            }
            List<Node> res = new LinkedList<>();
            res.add(new TextNode(" "));
            res.addAll(func(func, columns));
            return res;
        }

        /* visit const
         * --------------------------------------------------------------------------------------------------------- */

        @Override
        public List<Node> visitStringConst(SQLNIParser.StringConstContext ctx) {
            return textOf(ctx.getText());
        }

        @Override
        public List<Node> visitNumberConst(SQLNIParser.NumberConstContext ctx) {
            return textOf(ctx.getText());
        }

        /* visit table
         * --------------------------------------------------------------------------------------------------------- */

        @Override
        public List<Node> visitConstTable(SQLNIParser.ConstTableContext ctx) {
            List<Node> nodes = new ArrayList<>(textOf(" "));
            nodes.addAll(textOf(ctx.getText()));
            return nodes;
        }


        /* visit param
         * --------------------------------------------------------------------------------------------------------- */

        @Override
        public List<Node> visitParam(SQLNIParser.ParamContext ctx) {
            // TODO: 若为集合需要展开，若不在参数表里需要报错
            symbolsSet.add(ctx.ID().getText());
            return null;
        }


        /* visit conditions
         * --------------------------------------------------------------------------------------------------------- */

        @Override
        public List<Node> visitSingleCondition(SQLNIParser.SingleConditionContext ctx) {
            return visit(ctx.condition());
        }

        @Override
        public List<Node> visitMultiCondtions(SQLNIParser.MultiCondtionsContext ctx) {
            List<Node> res = new LinkedList<>(visit(ctx.condition()));
            if (ctx.AND() != null) {
                res.add(new TextNode(" " + and()));
            } else if (ctx.OR() != null) {
                res.add(new TextNode(" " + or()));
            }
            return res;
        }

        /* visit condition
         * --------------------------------------------------------------------------------------------------------- */

        @Override
        public List<Node> visitCmpCondition(SQLNIParser.CmpConditionContext ctx) {
            List<Node> res = null;
            List<Node> left = visit(ctx.column(0));
            List<Node> right = visit(ctx.column(1));
//        '='|'!='|'<'|'<='|'>'|'>='
            switch (ctx.OP().getText()) {
                case "=" -> res = isEqualTo(left, right);
                case "!=" -> res = isNotEqualTo(left, right);
                case "<" -> res = isLessThan(left, right);
                case "<=" -> res = isLessThanOrEqualTo(left, right);
                case ">" -> res = isGreaterThan(left, right);
                case ">=" -> res = isGreaterThanOrEqualTo(left, right);
            }
            return res;
        }

        @Override
        public List<Node> visitInParamCondition(SQLNIParser.InParamConditionContext ctx) {
            return super.visitInParamCondition(ctx);
        }

        @Override
        public List<Node> visitInSetCondition(SQLNIParser.InSetConditionContext ctx) {
            return super.visitInSetCondition(ctx);
        }


        /**
         * 符号集合，用于在生成循环内部局部变量时避免重复
         */
        Set<String> symbolsSet = new HashSet<>(); // 暂未实现有关功能


    }

}
