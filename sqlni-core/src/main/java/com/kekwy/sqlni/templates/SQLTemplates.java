package com.kekwy.sqlni.templates;

import java.util.HashMap;
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

    private final String name;

    private final Map<Keyword, String> keywordMap = new HashMap<>();

    private final Map<String, String> funcTemplateMap = new HashMap<>();

    protected SQLTemplates(String name) {
        this.name = name;

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
    }

    protected void addKeyWord(Keyword Keyword, String s) {
        keywordMap.put(Keyword, s);
    }

    protected void addFuncTemplate(String funcName, String template) {
        funcTemplateMap.put(funcName, template);
    }

    public String keyword(Keyword keyword) {
        return keywordMap.get(keyword);
    }

    public String function(String funcName) {
        return funcTemplateMap.get(funcName);
    }

    public String name() {
        return this.name;
    }

}
