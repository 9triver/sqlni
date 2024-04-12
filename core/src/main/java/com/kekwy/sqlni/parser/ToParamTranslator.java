package com.kekwy.sqlni.parser;

import com.kekwy.sqlni.parser.gen.ParamTransBaseVisitor;
import com.kekwy.sqlni.parser.gen.ParamTransParser;
import com.kekwy.sqlni.util.ASTParseUtil;
import org.antlr.v4.runtime.tree.ParseTree;

public class ToParamTranslator extends ParamTransBaseVisitor<String> {

    public String trans(String statement) {
        ParseTree tree = ASTParseUtil.parseParamTrans(statement);
        return visit(tree);
    }

    @Override
    public String visitRoot(ParamTransParser.RootContext ctx) {
        int n = ctx.getChildCount();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(visit(ctx.getChild(i)));
        }
        return builder.toString();
    }

    @Override
    public String visitFromParam1(ParamTransParser.FromParam1Context ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFromParam2(ParamTransParser.FromParam2Context ctx) {
        return ctx.getText();
    }

    @Override
    public String visitToParam1(ParamTransParser.ToParam1Context ctx) {
        return "#{" + ctx.ID().getText() + "}";
    }

    @Override
    public String visitToParam2(ParamTransParser.ToParam2Context ctx) {
        return "${" + ctx.ID().getText() + "}";
    }

    @Override
    public String visitAny(ParamTransParser.AnyContext ctx) {
        int n = ctx.getChildCount();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(ctx.getChild(i).getText());
        }
        return builder.toString();
    }
}
