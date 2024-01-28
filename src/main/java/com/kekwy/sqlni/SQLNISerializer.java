package com.kekwy.sqlni;

import com.kekwy.sqlni.node.ElementNode;
import com.kekwy.sqlni.node.Node;
import com.kekwy.sqlni.node.TextNode;
import com.kekwy.sqlni.parser.SQLNIBaseVisitor;
import com.kekwy.sqlni.parser.SQLNILexer;
import com.kekwy.sqlni.parser.SQLNIParser;
import com.kekwy.sqlni.templates.SQLTemplates;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

import static com.kekwy.sqlni.util.SQLTemplatesUtil.*;

/**
 * 解析 SQLNI 语句并将其表达的查询序列化为 XML 格式
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/28 16:29
 */
public class SQLNISerializer extends SQLNIBaseVisitor<List<Node>> {

    private SQLTemplates sqlTemplates;

    private ElementNode root;

    public SQLNISerializer(SQLTemplates sqlTemplates) {
        this.sqlTemplates = sqlTemplates;
    }

    public ElementNode serialize(String statement) {
        ParseTree tree = parseSQLNI(statement);
        sqlTemplates.serialize(tree, this); // 访问者模式
        return root;
    }

    public static ParseTree parseSQLNI(String statement) {
        SQLNILexer lexer = new SQLNILexer(CharStreams.fromString(statement));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLNIParser parser = new SQLNIParser(tokens);
        return parser.root();
    }

    private static final String TAG_SELECT = "select";

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
            return func("limitWithOffset", List.of(
                    List.of(new TextNode(ctx.NUMBER(0).getText())),
                    List.of(new TextNode(ctx.NUMBER(1).getText()))
            ));
        } else {
            return func("limit", List.of(
                    List.of(new TextNode(ctx.NUMBER(0).getText()))
            ));
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
        List<List<Node>> params = new LinkedList<>();
        List<SQLNIParser.ColumnContext> columnCtxList = ctx.column();
        for (SQLNIParser.ColumnContext columnCtx : columnCtxList) {
            params.add(visit(columnCtx));
        }
        List<Node> res = new LinkedList<>();
        res.add(new TextNode(" "));
        res.addAll(func(func, params));
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
        List<Node> left = visit(ctx.column(0));
        List<Node> right = visit(ctx.column(1));
//        '='|'!='|'<'|'<='|'>'|'>=
        return func(ctx.OP().getText(), List.of(left, right));
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

