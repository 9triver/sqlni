package com.kekwy.sqlni.parser;

import com.github.drinkjava2.jdialects.SqlFormatter;
import com.kekwy.sqlni.parser.gen.DynamicSQLBaseVisitor;
import com.kekwy.sqlni.parser.gen.DynamicSQLParser;
import com.kekwy.sqlni.util.ASTParseUtil;
import com.kekwy.sqlni.util.ElementNode;
import com.kekwy.sqlni.util.Node;
import com.kekwy.sqlni.util.TextNode;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;

public class SQLNIXMLProcessor extends DynamicSQLBaseVisitor<Void> {

    public Node process(String statement) {
        statement = new ToParamTranslator().trans(statement);       // 还原变量
        statement = SqlFormatter.format(statement);                 // 格式化 SQL 语句
        ParseTree tree = ASTParseUtil.parseMyBatisTag(statement + ";");   // 解析 MyBatis 的标签
        visit(tree);
        return root;
    }

    private ElementNode root = new ElementNode("root");

    @Override
    public Void visitIf(DynamicSQLParser.IfContext ctx) {
        String test = collectAny(ctx.any());
        ElementNode old_root = root;    // 保存旧根节点
        root = new ElementNode("if", Map.of("test", test));
        visit(ctx.root());
        old_root.addNode(root);
        root = old_root;                // 还原旧根节点
        return null;
    }

    @Override
    public Void visitForeach(DynamicSQLParser.ForeachContext ctx) {
        String itemName = ctx.param().ID().getText() + "_item";
        ElementNode node = new ElementNode("foreach", Map.of(
                "collection", ctx.param().ID().getText(),
                "index", "i",
                "item", itemName,
                "open", " ",
                "close", " ",
                "separator", ","
        ));
        node.addNode(new TextNode(ctx.param().left.getText() + itemName + ctx.param().right.getText()));
        root.addNode(node);
        return null;
    }

    @Override
    public Void visitAny(DynamicSQLParser.AnyContext ctx) {
        root.addNode(new TextNode(collectAny(ctx)));
        return null;
    }

    private String collectAny(DynamicSQLParser.AnyContext ctx) {
        StringBuilder builder = new StringBuilder();
        int n = ctx.getChildCount();
        for (int i = 0; i < n; i++) {
            builder.append(ctx.getChild(i).getText());
        }
        return builder.toString();
    }

}
