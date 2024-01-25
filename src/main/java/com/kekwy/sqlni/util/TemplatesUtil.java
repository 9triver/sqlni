package com.kekwy.sqlni.util;

import com.kekwy.sqlni.node.Node;
import com.kekwy.sqlni.node.TextNode;
import com.kekwy.sqlni.parser.FuncTemplateBaseVisitor;
import com.kekwy.sqlni.parser.FuncTemplateParser;
import com.kekwy.sqlni.templates.Keyword;
import com.kekwy.sqlni.templates.MySQLTemplates;
import com.kekwy.sqlni.templates.OracleTemplates;
import com.kekwy.sqlni.templates.SQLTemplates;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.*;


/**
 * 用于解析模板的工具类
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/24 9:22
 */
public class TemplatesUtil {

    /* 静态常量
     * --------------------------------------------------------------------------------------------------------- */

    private static final String CONFIG_FILE_NAME = "sqlni.properties";
    private static final String SQL_TEMPLATES_PROPERTY = "sql-templates";

    private static final Map<String, SQLTemplates> templatesMap = Map.of(
            "MySQL", new MySQLTemplates(),
            "Oracle", new OracleTemplates()
    );


    public static SQLTemplates getTemplates(String name) {
        return templatesMap.get(name);
    }



    /* 成员变量
     * --------------------------------------------------------------------------------------------------------- */

    private static SQLTemplates defaultSQLTemplates; // 从配置文件中读取的全局 SQL 模板
    private static SQLTemplates sqlTemplates;
    private static final Map<String, ParseTree> parseTreeCache = new HashMap<>();

    // 初始化 SQL 模板
    static {
        SQLTemplates tmp;
        try {
            Properties properties = new Properties();
            properties.load(
                    Objects.requireNonNull(
                            TemplatesUtil.class.getClassLoader().getResource(CONFIG_FILE_NAME)
                    ).openStream()
            );
            tmp = TemplatesUtil.getTemplates(properties.getProperty(SQL_TEMPLATES_PROPERTY));
        } catch (IOException e) {
            tmp = new MySQLTemplates();
        }
        defaultSQLTemplates = tmp;
        sqlTemplates = defaultSQLTemplates;
    }

    public static void setDefaultSQLTemplates(String name) {
        defaultSQLTemplates = getTemplates(name);
        sqlTemplates = defaultSQLTemplates;
    }

    public static void setSQLTemplates(String name) {
        sqlTemplates = getTemplates(name);
    }

    public static void resetSQLTemplates() {
        sqlTemplates = defaultSQLTemplates;
    }

    /* 方法：SQL 关键字
     * --------------------------------------------------------------------------------------------------------- */

    public static String select() {
        return sqlTemplates.keyword(Keyword.SELECT);
    }

    public static String from() {
        return sqlTemplates.keyword(Keyword.FROM);
    }

    public static String where() {
        return sqlTemplates.keyword(Keyword.WHERE);
    }

    public static String distinct() {
        return sqlTemplates.keyword(Keyword.DISTINCT);
    }

    public static String and() {
        return sqlTemplates.keyword(Keyword.AND);
    }

    public static String or() {
        return sqlTemplates.keyword(Keyword.OR);
    }

    /* 方法：SQL 函数及其他关键字
     * --------------------------------------------------------------------------------------------------------- */

    /**
     * 调用 SQL 函数，根据当前设置的 SQL 模板生成对应 XML 结构
     *
     * @param name   函数名
     * @param params 参数列表（需要随机访问）
     */
    public static List<Node> func(String name, List<List<Node>> params) {
        String fullName = sqlTemplates.name() + "::" + name;
        ParseTree parseTree;
        if (parseTreeCache.containsKey(fullName)) {
            parseTree = parseTreeCache.get(fullName);
        } else {
            // TODO: 若找不到相应函数则需处理异常
            String template = sqlTemplates.function(name);
            parseTree = ParserUtil.parseFuncTemplate(template);
            parseTreeCache.put(fullName, parseTree);
        }
        return new FuncTemplateVisit(params).visit(parseTree);
    }

    private static class FuncTemplateVisit extends FuncTemplateBaseVisitor<List<Node>> {

        private final List<List<Node>> params;

        public FuncTemplateVisit(List<List<Node>> params) {
            this.params = params;
        }

        @Override
        public List<Node> visitVarParams(FuncTemplateParser.VarParamsContext ctx) {
            List<Node> res = new LinkedList<>();
            if (ctx.left != null) {
                res.add(new TextNode(ctx.left.getText()));
            }
            Iterator<List<Node>> it = params.iterator();
            res.addAll(it.next());
            while (it.hasNext()) {
                res.add(new TextNode(ctx.separator.getText()));
                res.addAll(it.next());
            }
            if (ctx.right != null) {
                res.add(new TextNode(ctx.right.getText()));
            }
            return res;
        }

        @Override
        public List<Node> visitFixedParams(FuncTemplateParser.FixedParamsContext ctx) {
            List<ParseTree> children = ctx.children;
            List<Node> res = new LinkedList<>();
            for (ParseTree tree : children) {
                res.addAll(visit(tree));
            }
            return res;
        }

        @Override
        public List<Node> visitParam(FuncTemplateParser.ParamContext ctx) {
            return params.get(Integer.parseInt(ctx.INT().getText()));
        }

        @Override
        public List<Node> visitText(FuncTemplateParser.TextContext ctx) {
            return List.of(new TextNode(ctx.getText()));
        }
    }

}
