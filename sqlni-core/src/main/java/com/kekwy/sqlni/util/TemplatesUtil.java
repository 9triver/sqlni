package com.kekwy.sqlni.util;

import com.kekwy.sqlni.node.Node;
import com.kekwy.sqlni.node.TextNode;
import com.kekwy.sqlni.templates.*;

import java.io.IOException;
import java.util.*;


/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/24 9:22
 */
public class TemplatesUtil {

    private static final Map<String, SQLTemplates> templatesMap = Map.of(
            "MySQL", new MySQLTemplates(),
            "Oracle", new OracleTemplates()
    );

    // 建立 SQLNI 语法对函数的表示方式到对应函数的枚举变量之间的映射
    private static final Map<String, Function> functionMap = Map.of(
            "concat", Function.CONCAT
    );

    public static SQLTemplates getTemplates(String name) {
        return templatesMap.get(name);
    }

    /* 成员：静态常量
     * --------------------------------------------------------------------------------------------------------- */

    private static final String CONFIG_FILE_NAME = "sqlni.properties";
    private static final String SQL_TEMPLATES_PROPERTY = "sql-templates";

    /* 成员：SQL 模板
     * --------------------------------------------------------------------------------------------------------- */

    private static final SQLTemplates defaultSQLTemplates; // 从配置文件中读取的全局 SQL 模板

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

    private static SQLTemplates sqlTemplates;

    public static void setSQLTemplates(SQLTemplates sqlTemplates) {
        TemplatesUtil.sqlTemplates = sqlTemplates;
    }

    public static void resetSQLTemplates() {
        sqlTemplates = defaultSQLTemplates;
    }

    /* 方法：SQL 关键字
     * --------------------------------------------------------------------------------------------------------- */

    public static String select() {
        return sqlTemplates.getKeyword(Keyword.SELECT);
    }

    public static String from() {
        return sqlTemplates.getKeyword(Keyword.FROM);
    }

    public static String where() {
        return sqlTemplates.getKeyword(Keyword.WHERE);
    }

    public static String distinct() {
        return sqlTemplates.getKeyword(Keyword.DISTINCT);
    }

    public static String and() {
        return sqlTemplates.getKeyword(Keyword.AND);
    }

    public static String or() {
        return sqlTemplates.getKeyword(Keyword.OR);
    }

    /* 方法：SQL 函数及其他关键字
     * --------------------------------------------------------------------------------------------------------- */

    public static List<Node> func(String funcName, List<Node> params) {
        // TODO: 若找不到相应函数则需处理异常
        Function function = functionMap.get(funcName);
        return null;
    }

    public static List<Node> limit(String limitN, String offsetN) {
        return List.of(new TextNode("limit " + limitN + " offset " + offsetN));
    }

    public static List<Node> limit(String limitN) {
        return List.of(new TextNode("limit " + limitN));
    }

    /* 方法：比较条件
     * --------------------------------------------------------------------------------------------------------- */

    private static List<Node> compare(Operator opt, List<Node> left, List<Node> right) {
        List<Node> nodes = new LinkedList<>(left);
        nodes.add(new TextNode(" " + sqlTemplates.getOpt(opt) + " ")); // a + b
        nodes.addAll(right);
        return nodes;
    }

    public static List<Node> isEqualTo(List<Node> left, List<Node> right) {
        return compare(Operator.EQUAL, left, right);
    }

    public static List<Node> isNotEqualTo(List<Node> left, List<Node> right) {
        return compare(Operator.NOT_EQUAL, left, right);
    }

    public static List<Node> isLessThan(List<Node> left, List<Node> right) {
        return compare(Operator.LESS_THAN, left, right);
    }

    public static List<Node> isLessThanOrEqualTo(List<Node> left, List<Node> right) {
        return compare(Operator.LESS_THAN_OR_EQUAL, left, right);
    }

    public static List<Node> isGreaterThan(List<Node> left, List<Node> right) {
        return compare(Operator.GREATER_THAN, left, right);
    }

    public static List<Node> isGreaterThanOrEqualTo(List<Node> left, List<Node> right) {
        return compare(Operator.GREATER_THAN_OR_EQUAL, left, right);
    }

}
