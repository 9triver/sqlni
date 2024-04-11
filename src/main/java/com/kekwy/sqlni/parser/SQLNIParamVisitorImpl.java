package com.kekwy.sqlni.parser;

public class SQLNIParamVisitorImpl extends SQLNIParamBaseVisitor<String> {

    @Override
    public String visitRoot(SQLNIParamParser.RootContext ctx) {
        int n = ctx.getChildCount();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(visit(ctx.getChild(i)));
        }
        return builder.toString();
    }

    @Override
    public String visitParam1(SQLNIParamParser.Param1Context ctx) {
        return "#{" + ctx.PARAM1().getText().substring("SQLNI_PARAM1_".length()) + "}";
    }

    @Override
    public String visitParam2(SQLNIParamParser.Param2Context ctx) {
        return "${" + ctx.PARAM2().getText().substring("SQLNI_PARAM2_".length()) + "}";
    }

    @Override
    public String visitAny(SQLNIParamParser.AnyContext ctx) {
        int n = ctx.getChildCount();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(ctx.getChild(i).getText());
        }
        return builder.toString();
    }
}
