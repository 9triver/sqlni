package com.kekwy.sqlni.parser;

import com.github.drinkjava2.jdialects.Dialect;
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
    public String visitChildren(RuleNode node) {
        StringBuilder builder = new StringBuilder();
        int n = node.getChildCount();
        for (int i = 0; i < n; i++) {
            ParseTree c = node.getChild(i);
            builder.append(c.accept(this));
        }
        return builder.toString();
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        return " " + node.getText();
    }

    @Override
    public String visitParam1(SQLNIParser.Param1Context ctx) {
        return " SQLNI_PARAM1_" + ctx.ID().getText();
    }

    @Override
    public String visitParam2(SQLNIParser.Param2Context ctx) {
        return " SQLNI_PARAM2_" + ctx.ID().getText();
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
    public String visitSubQuery(SQLNIParser.SubQueryContext ctx) {
        return " (" + new SQLNIDialectProcessor(dialect).process(ctx.select()) + ")";
    }

    @Override
    public String visitSubQueryTable(SQLNIParser.SubQueryTableContext ctx) {
        return " (" + new SQLNIDialectProcessor(dialect).process(ctx.select()) + ")" + visit(ctx.as());
    }

    @Override
    public String visitFuncColumn(SQLNIParser.FuncColumnContext ctx) {
        StringBuilder builder = new StringBuilder();
        int n = ctx.getChildCount();
        for (int i = 1; i < n; i++) {
            builder.append(visit(ctx.getChild(i)));
        }
        return " " + ctx.ID().getText() + builder.toString().trim(); // 函数名和括号之间不能有空格，否则 JDialects 不能正确转换
    }
}
