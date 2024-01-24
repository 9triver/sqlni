package com.kekwy.sqlni;

import com.kekwy.sqlni.node.ElementNode;
import com.kekwy.sqlni.node.Node;
import com.kekwy.sqlni.node.TextNode;
import com.kekwy.sqlni.parser.SQLNIBaseVisitor;
import com.kekwy.sqlni.parser.SQLNIParser;
import com.kekwy.sqlni.templates.MySQLTemplates;
import com.kekwy.sqlni.templates.SQLTemplates;
import com.kekwy.sqlni.util.SQLTemplatesUtil;
import org.antlr.v4.runtime.tree.ParseTree;
import org.mybatis.dynamic.sql.SqlBuilder;

import java.io.IOException;
import java.util.*;


/**
 * SQLNI 语法树的访问器。
 * 后序遍历语法树，生成 XML 数据及其结构。
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/17 21:31
 */
public class SQLNIVisitor extends SQLNIBaseVisitor<List<Node>> {

//    private final Stack<ElementNode> nodeStack = new Stack<>();

    public ElementNode visit(ParseTree tree, Map<String, String> attributes) {
        ElementNode node = (ElementNode) super.visit(tree).get(0);
        node.addAttributes(attributes);
        return node;
    }

    /**
     * 从配置文件中读取的全局 SQL 模板
     */
    private static final SQLTemplates defaultTemplates;

    static {
        SQLTemplates tmp;
        try {
            Properties properties = new Properties();
            properties.load(
                    Objects.requireNonNull(
                            SQLNIVisitor.class.getClassLoader().getResource("sqlni.properties")
                    ).openStream()
            );
            tmp = SQLTemplatesUtil.getTemplates(properties.getProperty("sql-templates"));
        } catch (IOException e) {
            tmp = new MySQLTemplates();
        }
        defaultTemplates = tmp;
    }

    private final SQLTemplates templates;

    /**
     * 使用配置文件中指定的全局 SQL 模板
     */
    public SQLNIVisitor() {
        this.templates = defaultTemplates;
    }

    /**
     * 用户可以为单独的方法指定 SQL 模板（不建议使用）
     */
    public SQLNIVisitor(SQLTemplates templates) {
        this.templates = templates;
    }

    private static final String TAG_SELECT = "select";

    @Override
    public List<Node> visitSelect(SQLNIParser.SelectContext ctx) {
        ElementNode selectNode = new ElementNode(TAG_SELECT);
        String select = templates.select();
        String from = templates.from();
        selectNode.addTextWithoutSpace(select);     // select
        /* distinct */
        if (ctx.DISTINCT() != null) {
            selectNode.addText(templates.distinct());
        }
        if (ctx.columns() != null) {
            selectNode.addNodes(visit(ctx.columns()));    // select columns
        } else {
            selectNode.addText("*");
        }
        selectNode.addText(from); // select columns from
        selectNode.addNodes(visit(ctx.table()));      // select columns from table
        /*  where   */
        if (ctx.WHERE() != null) {
            selectNode.addText(templates.where());
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
            return templates.limit(ctx.NUMBER(0).getText(), ctx.NUMBER(1).getText());
        } else {
            return templates.limit(ctx.NUMBER(0).getText());
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
        res.addAll(templates.func(func, columns));
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
            res.add(new TextNode(" " + templates.and()));
        } else if (ctx.OR() != null) {
            res.add(new TextNode(" " + templates.or()));
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
            case "=" -> res = templates.isEqualTo(left, right);
            case "!=" -> res = templates.isNotEqualTo(left, right);
            case "<" -> res = templates.isLessThan(left, right);
            case "<=" -> res = templates.isLessThanOrEqualTo(left, right);
            case ">" -> res = templates.isGreaterThan(left, right);
            case ">=" -> res = templates.isGreaterThanOrEqualTo(left, right);
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
