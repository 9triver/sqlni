package com.kekwy.sqlni.templates;

import com.kekwy.sqlni.SQLNISerializer;
import com.kekwy.sqlni.parser.FuncTemplateBaseVisitor;
import com.kekwy.sqlni.parser.FuncTemplateLexer;
import com.kekwy.sqlni.parser.FuncTemplateParser;
import com.kekwy.sqlni.parser.SQLNIParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static com.kekwy.sqlni.templates.Keyword.*;

/**
 * 通用 SQL 语句的模板
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 14:28
 */
public abstract class SQLTemplates {

    private final Map<Keyword, String> keywordMap = new HashMap<>();

    private final Map<String, String> funcTemplateMap = new HashMap<>();

    protected SQLTemplates() {
        addKeyWord(SELECT, "SELECT");
        addKeyWord(FROM, "FROM");
        addKeyWord(WHERE, "WHERE");
        addKeyWord(AND, "AND");
        addKeyWord(OR, "OR");
        addKeyWord(DISTINCT, "DISTINCT");

        addFuncTemplate("=", "{0} = {1}");
        addFuncTemplate("!=", "{0} != {1}");
        addFuncTemplate("<", "{0} < {1}");
        addFuncTemplate("<=", "{0} <= {1}");
        addFuncTemplate(">", "{0} > {1}");
        addFuncTemplate(">=", "{0} >= {1}");

        addFuncTemplate("limit", "LIMIT {0}");
        addFuncTemplate("limitOffset", "OFFSET {0}");
    }

    protected void addKeyWord(Keyword Keyword, String s) {
        keywordMap.put(Keyword, s);
    }

    protected void addFuncTemplate(String funcName, String template) {
        funcTemplateMap.put(funcName, template);
    }

    public String getSelect() {
        return keywordMap.get(SELECT);
    }

    public String getDistinct() {
        return keywordMap.get(DISTINCT);
    }

    public String getFrom() {
        return keywordMap.get(FROM);
    }

    public String getWhere() {
        return keywordMap.get(WHERE);
    }

    public String getAnd() {
        return keywordMap.get(AND);
    }

    public String getOr() {
        return keywordMap.get(OR);
    }

    public void serialize(SQLNIParser.SelectContext context, SQLNISerializer serializer) {
        serializer.serialize(context);
    }

    public void serializeLimit(SQLNIParser.SelectContext context, SQLNISerializer serializer) {
        serializer.append(" "); // 添加一个空格分割关键字
        if (context.limit() != null) {
            function("limit", List.of(context.limit()), serializer);
            if (context.offset() != null) {
                serializer.append(" ");
                function("limitOffset", List.of(context.offset()), serializer);
            }
        } else {
            function("limitOffset", List.of(context.offset()), serializer);
        }
    }

    private final Map<String, ParseTree> funcParseTreeCache = new HashMap<>();

    public void function(String funcName, List<? extends ParseTree> contexts, SQLNISerializer serializer) {
        ParseTree tree;
        if (funcParseTreeCache.containsKey(funcName)) {
            tree = funcParseTreeCache.get(funcName);
        } else {
            tree = parseFuncTemplate(funcTemplateMap.get(funcName));
            funcParseTreeCache.put(funcName, tree);
        }
        new FuncTemplateVisit(contexts, serializer).visit(tree);
    }

    public static ParseTree parseFuncTemplate(String template) {
        FuncTemplateLexer lexer = new FuncTemplateLexer(CharStreams.fromString(template));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FuncTemplateParser parser = new FuncTemplateParser(tokens);
        return parser.function();
    }

    private static class FuncTemplateVisit extends FuncTemplateBaseVisitor<Void> {

        private final List<? extends ParseTree> contexts;
        private final SQLNISerializer serializer;

        public FuncTemplateVisit(List<? extends ParseTree> contexts, SQLNISerializer serializer) {
            this.contexts = contexts;
            this.serializer = serializer;
        }

        @Override
        public Void visitVarParams(FuncTemplateParser.VarParamsContext ctx) {
            if (ctx.left != null) {
                serializer.append(ctx.left.getText());
            }
            Iterator<? extends ParseTree> it = contexts.iterator();
            serializer.handle(it.next());
            while (it.hasNext()) {
                serializer.append(ctx.separator.getText());
                serializer.handle(it.next());
            }
            if (ctx.right != null) {
                serializer.append(ctx.right.getText());
            }
            return null;
        }

        @Override
        public Void visitFixedParams(FuncTemplateParser.FixedParamsContext ctx) {
            List<ParseTree> children = ctx.children;
            for (ParseTree tree : children) {
                visit(tree);
            }
            return null;
        }

        @Override
        public Void visitParam(FuncTemplateParser.ParamContext ctx) {
            serializer.handle(contexts.get(Integer.parseInt(ctx.INT().getText())));
            return null;
        }

        @Override
        public Void visitText(FuncTemplateParser.TextContext ctx) {
            serializer.append(ctx.getText());
            return null;
        }
    }

}
