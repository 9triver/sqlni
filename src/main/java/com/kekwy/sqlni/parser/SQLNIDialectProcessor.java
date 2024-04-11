package com.kekwy.sqlni.parser;

import com.github.drinkjava2.jdialects.Dialect;
import com.kekwy.sqlni.parser.gen.SQLNIBaseVisitor;
import com.kekwy.sqlni.parser.gen.SQLNIParser;
import com.kekwy.sqlni.util.ASTParseUtil;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SQLNIDialectProcessor extends SQLNIBaseVisitor<String> {

    private String limit = null;
    private String offset = null;
    private final Dialect dialect;

    public SQLNIDialectProcessor(Dialect dialect) {
        this.dialect = dialect;
    }

    public String process(String statement) {
        statement = new FromParamTranslator().trans(statement);// 替换变量
        // 进行方言转换
        String sql = visit(ASTParseUtil.parseSQLNI(statement)).trim();
        if (limit != null) {
            if (offset == null) offset = "0";
            return dialect.limitAndTrans(offset, limit, sql);
        } else {
            return dialect.trans(sql);
        }
    }

    public String process(ParseTree tree) {
        String sql = visit(tree).trim();
        if (limit != null) {
            if (offset == null) offset = "0";
            return dialect.limitAndTrans(offset, limit, sql);
        } else {
            return dialect.trans(sql);
        }
    }

    @Override
    public String visitLimit(SQLNIParser.LimitContext ctx) {
        limit = visit(ctx.getChild(1)).trim();
        return "";
    }

    @Override
    public String visitOffset(SQLNIParser.OffsetContext ctx) {
        offset = visit(ctx.getChild(1)).trim();
        return "";
    }

    @Override
    public String visitChildren(RuleNode node) {
        int n = node.getChildCount();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(visit(node.getChild(i)));
        }
        return builder.toString();
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        return node.getText();
    }

    @Override
    public String visitNestedExpr(SQLNIParser.NestedExprContext ctx) {
        return "(" + new SQLNIDialectProcessor(dialect).process(ctx.root()) + ")";
    }

    @Override
    public String visitEnd(SQLNIParser.EndContext ctx) {
        return "";
    }
}
