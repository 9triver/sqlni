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

/**
 * 解析 SQLNI 语句并将其表达的查询序列化为 XML 格式
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/28 16:29
 */
public class SQLNISerializer extends SQLNIBaseVisitor<Void> {

    private final SQLTemplates sqlTemplates;

    private ElementNode root;

    public SQLNISerializer(SQLTemplates sqlTemplates) {
        this.sqlTemplates = sqlTemplates;
    }

    /**
     * 将 SQLNI 语句序列化为 XML 格式，
     */
    public ElementNode serialize(String statement) {
        ParseTree tree = parseSQLNI(statement);
        visit(tree);
        return root;
    }

    /**
     * 解析 SQLNI 语句，生成语法树。
     */
    private ParseTree parseSQLNI(String statement) {
        SQLNILexer lexer = new SQLNILexer(CharStreams.fromString(statement));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLNIParser parser = new SQLNIParser(tokens);
        return parser.root();
    }

    public void append(String s) {
        root.addNode(new TextNode(s));
    }

    public void append(List<Node> next) {
        root.addNodes(next);
    }

    public String space(String s) {
        return " " + s;
    }

    private static final String TAG_SELECT = "select";

    @Override
    public Void visitSelect(SQLNIParser.SelectContext ctx) {
        root = new ElementNode(TAG_SELECT);
        sqlTemplates.serialize(ctx, this); // 访问者模式
        return null;
    }

    public void serialize(SQLNIParser.SelectContext ctx) {
        append(sqlTemplates.getSelect());       // select
        /* distinct */
        if (ctx.DISTINCT() != null) {
            append(space(sqlTemplates.getDistinct()));
        }
        if (ctx.columns() != null) {
            visit(ctx.columns());               // select columns
        } else {
            append(space("*"));
        }
        append(space(sqlTemplates.getFrom()));  // select columns from
        visit(ctx.table());                     // select columns from table
        /*  where   */
        if (ctx.WHERE() != null) {
            append(space(sqlTemplates.getWhere()));
            visit(ctx.conditions());
        }
        /*  limit   */
        if (ctx.limit() != null || ctx.offset() != null) {
            sqlTemplates.serializeLimit(ctx, this);
        }
    }

    private List<Node> textOf(String text) {
        return List.of(new TextNode(text));
    }

    /* visit column
     * --------------------------------------------------------------------------------------------------------- */

    @Override
    public Void visitColumns(SQLNIParser.ColumnsContext ctx) {
        List<SQLNIParser.ColumnContext> columnContexts = ctx.column();  // column1
        visit(columnContexts.get(0));
        for (int i = 1; i < columnContexts.size(); i++) {
            append(", ");                                               // column1,
            visit(columnContexts.get(i));                               // column1, column2
        }                                                               // column1, column2, ..., columnN
        return null;
    }

    @Override
    public Void visitNormalColumn(SQLNIParser.NormalColumnContext ctx) {
        append(ctx.getText());
        return null;
    }

    @Override
    public Void visitParamColumn(SQLNIParser.ParamColumnContext ctx) {
        visit(ctx.param());
        append(ctx.getText());
        return null;
    }

    @Override
    public Void visitFuncColumn(SQLNIParser.FuncColumnContext ctx) {
        String func = ctx.ID().getText();
        append(space(""));
        sqlTemplates.function(func, ctx.columns(), this);
        return null;
    }

    /* visit const
     * --------------------------------------------------------------------------------------------------------- */

    @Override
    public Void visitStringConst(SQLNIParser.StringConstContext ctx) {
        append(ctx.getText());
        return null;
    }

    @Override
    public Void visitNumberConst(SQLNIParser.NumberConstContext ctx) {
        append(ctx.getText());
        return null;
    }

    /* visit table
     * --------------------------------------------------------------------------------------------------------- */

    @Override
    public Void visitConstTable(SQLNIParser.ConstTableContext ctx) {
        append(space(ctx.getText()));
        return null;
    }

    /* visit param
     * --------------------------------------------------------------------------------------------------------- */

    @Override
    public Void visitParam(SQLNIParser.ParamContext ctx) {
        // TODO: 若为集合需要展开，若不在参数表里需要报错
        symbolsSet.add(ctx.ID().getText());
        return null;
    }


    /* visit conditions
     * --------------------------------------------------------------------------------------------------------- */

    @Override
    public Void visitSingleCondition(SQLNIParser.SingleConditionContext ctx) {
        visit(ctx.condition());
        return null;
    }

    @Override
    public Void visitMultiCondtions(SQLNIParser.MultiCondtionsContext ctx) {
        visit(ctx.condition());
        if (ctx.AND() != null) {
            append(space(sqlTemplates.getAnd()));
        } else if (ctx.OR() != null) {
            append(space(sqlTemplates.getOr()));
        }
        return null;
    }

    /* visit condition
     * --------------------------------------------------------------------------------------------------------- */

    @Override
    public Void visitCmpCondition(SQLNIParser.CmpConditionContext ctx) {
//        '='|'!='|'<'|'<='|'>'|'>=
        sqlTemplates.function(ctx.OP().getText(), ctx, this);
        return null;
    }

    @Override
    public Void visitInParamCondition(SQLNIParser.InParamConditionContext ctx) {
        return super.visitInParamCondition(ctx);
    }

    @Override
    public Void visitInSetCondition(SQLNIParser.InSetConditionContext ctx) {
        return super.visitInSetCondition(ctx);
    }


    /**
     * 符号集合，用于在生成循环内部局部变量时避免重复
     */
    Set<String> symbolsSet = new HashSet<>(); // 暂未实现有关功能


}

