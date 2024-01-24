package com.kekwy.sqlni;

import com.kekwy.sqlni.node.ElementNode;
import com.kekwy.sqlni.node.Node;
import com.kekwy.sqlni.node.TextNode;
import com.kekwy.sqlni.parser.SQLNIBaseVisitor;
import com.kekwy.sqlni.parser.SQLNIParser;
import com.kekwy.sqlni.templates.MySQLTemplates;
import com.kekwy.sqlni.templates.SQLTemplates;
import org.antlr.v4.runtime.tree.ParseTree;

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
    private static SQLTemplates defaultTemplates = new MySQLTemplates();

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
        selectNode.addNode(new TextNode(select));     // select
        /* distinct */
        if (ctx.DISTINCT() != null) {
            selectNode.addNode(new TextNode(" " + templates.distinct()));
        }
        selectNode.addNodes(visit(ctx.columns()));    // select columns
        selectNode.addNode(new TextNode(" " + from)); // select columns from
        selectNode.addNodes(visit(ctx.table()));      // select columns from table
        /*  where   */
        if (ctx.WHERE() != null) {
            selectNode.addNode(new TextNode(" " + templates.where()));
            selectNode.addNodes(visit(ctx.conditions()));
        }
        /*  limit   */
        if (ctx.limit() != null) {
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
            return templates.limit(ctx.INT(0).getText(), ctx.INT(1).getText());
        } else {
            return templates.limit(ctx.INT(0).getText());
        }
    }


    /* visit column
     * --------------------------------------------------------------------------------------------------------- */

    @Override
    public List<Node> visitAllColumns(SQLNIParser.AllColumnsContext ctx) {
        return textOf(" " + ctx.getText()); // *
    }

    @Override
    public List<Node> visitCertainColumns(SQLNIParser.CertainColumnsContext ctx) {
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
    public List<Node> visitConstColumn(SQLNIParser.ConstColumnContext ctx) {
        return textOf(ctx.getText());
    }

    @Override
    public List<Node> visitParamColumn(SQLNIParser.ParamColumnContext ctx) {
        visit(ctx.param());
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

    /**
     * 符号集合，用于在生成循环内部局部变量时避免重复
     */
    Set<String> symbolsSet = new HashSet<>(); // 暂未实现有关功能

}
