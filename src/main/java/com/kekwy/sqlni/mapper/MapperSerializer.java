package com.kekwy.sqlni.mapper;

import com.kekwy.sqlni.node.ElementNode;
import com.kekwy.sqlni.node.Node;
import com.kekwy.sqlni.node.TextNode;
import com.kekwy.sqlni.parser.SQLNIBaseVisitor;
import com.kekwy.sqlni.parser.SQLNILexer;
import com.kekwy.sqlni.parser.SQLNIParser;
import com.kekwy.sqlni.templates.SQLTemplates;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

/**
 * 解析 SQLNI 语句并将其表达的查询序列化为 XML 格式
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/28 16:29
 */
public class MapperSerializer extends SQLNIBaseVisitor<Void> {

    private final SQLTemplates sqlTemplates;
    private ElementNode root;
    private String lastConditionConnector = null;

    private static final String TAG_SELECT = "select";
    private static final String TAG_IF = "if";
    private static final String TAG_FOREACH = "foreach";
    private static final String ATTR_TEST = "test";

    public MapperSerializer(SQLTemplates sqlTemplates) {
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

    private String space(String s) {
        return " " + s;
    }

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
            append(space(""));
            visit(ctx.columns());               // select columns
        } else {
            append(space("*"));
        }
        append(space(sqlTemplates.getFrom()));  // select columns from
        visit(ctx.table());                     // select columns from table
        /*  where   */
        if (ctx.WHERE() != null) {
            lastConditionConnector = sqlTemplates.getWhere();
            visit(ctx.conditions());
        }
        /*  limit   */
        if (ctx.limit() != null || ctx.offset() != null) {
            sqlTemplates.serializeLimit(ctx, this);
        }
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
        sqlTemplates.function(func, ctx.columns().column(), this);
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

    @Override
    public Void visitParamTable(SQLNIParser.ParamTableContext ctx) {
        return super.visitParamTable(ctx);
    }

    /* visit param
     * --------------------------------------------------------------------------------------------------------- */

    @Override
    public Void visitParam(SQLNIParser.ParamContext ctx) {
        // oldTODO: 若为集合需要展开，若不在参数表里需要报错
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
            lastConditionConnector = sqlTemplates.getAnd();
        } else if (ctx.OR() != null) {
            lastConditionConnector = sqlTemplates.getOr();
        }
        visit(ctx.conditions());
        return null;
    }

    /* visit condition
     * --------------------------------------------------------------------------------------------------------- */

    @Override
    public Void visitCmpCondition(SQLNIParser.CmpConditionContext ctx) {
        append(space(lastConditionConnector));
//        '='|'!='|'<'|'<='|'>'|'>=
        sqlTemplates.function(ctx.OP().getText(), ctx.column(), this);
        return null;
    }

    private static final String IS_NOT_NULL_TEMPLATE = "%s != null";

    @Override
    public Void visitInParamCondition(SQLNIParser.InParamConditionContext ctx) {
        if (Objects.equals(lastConditionConnector, sqlTemplates.getWhere())) {
            append(space(lastConditionConnector));
            append(space("1 = 1"));
            lastConditionConnector = sqlTemplates.getAnd();
        }
        visit(ctx.param());
        String param = ctx.param().ID().getText();
        Stack<ElementNode> stack = new Stack<>();
        // 创建 IF 结点
        stack.push(root);
        root = root.addElement(TAG_IF);
        root.addAttribute(ATTR_TEST,
                IS_NOT_NULL_TEMPLATE.formatted(param)
        );
        append(space(lastConditionConnector));
        append(" "); // 添加空格
        visit(ctx.column());
        append(space(sqlTemplates.getIn()));
        // 创建 ForEach 结点
        stack.push(root);
        root = root.addElement(TAG_FOREACH);
        String item = generateItem(param);
        root.addAttributes(Map.of(
                "collection", param,
                "index", "index",
                "item", item,
                "open", " {",
                "close", "} ",
                "separator", ", "
        ));
        append("#{" + item + "}");
        root = stack.pop(); // 退出 foreach 结点
        root = stack.pop(); // 退出 if 结点
        return null;
    }

    private String generateItem(String param) {
        String res = param + "Item";
        while (symbolsSet.contains(res)) { // 避免在上下文中有重复的变量名
            res += "I";
        }
        return res;
    }

    @Override
    public Void visitInSetCondition(SQLNIParser.InSetConditionContext ctx) {
        return super.visitInSetCondition(ctx);
    }


    @Override
    public Void visitNumberLimit(SQLNIParser.NumberLimitContext ctx) {
        append(ctx.getText());
        return null;
    }

    @Override
    public Void visitNumberOffset(SQLNIParser.NumberOffsetContext ctx) {
        append(ctx.getText());
        return null;
    }

    @Override
    public Void visitParamLimit(SQLNIParser.ParamLimitContext ctx) {
        visit(ctx.param());
        append(ctx.getText());
        return null;
    }

    @Override
    public Void visitParamOffset(SQLNIParser.ParamOffsetContext ctx) {
        visit(ctx.param());
        append(ctx.getText());
        return null;
    }


    /**
     * 符号集合，用于在生成循环内部局部变量时避免重复
     */
    Set<String> symbolsSet = new HashSet<>(); // 暂未实现有关功能

    public void handle(ParseTree tree) {
        if (tree instanceof ParserRuleContext) {
            visit(tree);
        } else {
            append(tree.getText());
        }
    }

}

