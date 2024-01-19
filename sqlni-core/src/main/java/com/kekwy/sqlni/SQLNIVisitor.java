package com.kekwy.sqlni;

import com.kekwy.sqlni.node.ElementNode;
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
public class SQLNIVisitor extends SQLNIBaseVisitor<Void> {

    private final Stack<ElementNode> nodeStack = new Stack<>();

    public ElementNode visit(ParseTree tree, Map<String, String> attributes) {
        super.visit(tree);
        ElementNode node = nodeStack.pop();
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
    public Void visitSelect(SQLNIParser.SelectContext ctx) {
        ElementNode selectNode = new ElementNode(TAG_SELECT);
        nodeStack.push(selectNode);         // 将方法根节点入栈
        String select = templates.select();
        String from = templates.from();
        selectNode.addText(select);  // select
        visit(ctx.columns());        // select columns
        selectNode.addText(from);    // select columns from
        visit(ctx.table());          // select columns from table
        return null;    // bugfix:
    }

    @Override
    public Void visitAllColumns(SQLNIParser.AllColumnsContext ctx) {
        return super.visitAllColumns(ctx);
    }

//    @Override
//    public Void visitS(SQLNIParser.ColumnsContext ctx) {
//        ElementNode top = nodeStack.peek();
//        List<SQLNIParser.ColumnContext> columnContexts = ctx.column();  // column1
//        visitColumn(columnContexts.get(0));
//        for (int i = 1; i < columnContexts.size(); i++) {
//            top.addText(", ");                                          // column1,
//            visit(columnContexts.get(i));                               // column1, column2
//        }                                                               // column1, column2, ..., columnN
//        return null;
//    }

    @Override
    public Void visitColumn(SQLNIParser.ColumnContext ctx) {
        ElementNode top = nodeStack.peek();
        top.addText(ctx.getText());
        return null;
    }

    /**
     * 符号集合，用于在生成循环内部局部变量时避免重复
     */
    Set<String> symbolsSet = new HashSet<>(); // 暂未实现有关功能

}
