package com.kekwy.sqlni.parser;

public class ToParamVisitorImpl extends ToParamBaseVisitor<String> {

    @Override
    public String visitRoot(ToParamParser.RootContext ctx) {
        int n = ctx.getChildCount();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(visit(ctx.getChild(i)));
        }
        return builder.toString();
    }

    @Override
    public String visitParam1(ToParamParser.Param1Context ctx) {
        return "#{" + ctx.PARAM1().getText().substring("SQLNI_PARAM1_".length()) + "}";
    }

    @Override
    public String visitParam2(ToParamParser.Param2Context ctx) {
        return "${" + ctx.PARAM2().getText().substring("SQLNI_PARAM2_".length()) + "}";
    }

    @Override
    public String visitAny(ToParamParser.AnyContext ctx) {
        int n = ctx.getChildCount();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(ctx.getChild(i).getText());
        }
        return builder.toString();
    }
}
