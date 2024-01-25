package com.kekwy.sqlni.templates;

import com.kekwy.sqlni.node.Node;
import com.kekwy.sqlni.node.TextNode;
import com.kekwy.sqlni.templates.function.SQLFunction;

import java.util.*;

import static com.kekwy.sqlni.templates.Keyword.*;

/**
 * 通用 SQL 语句的模板
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 14:28
 */
public abstract class SQLTemplates {


    public String distinct() {
        return keywordMap.get(Keyword.DISTINCT);
    }

    public String where() {
        return keywordMap.get(WHERE);
    }



    public List<Node> func(String func, List<Node> columns) {
        if (Objects.equals(func, "concat")) return concat(columns);
        return null;
    }

    abstract public List<Node> concat(List<Node> columns);




    public String getKeyword(Keyword keyword) {
        return keywordMap.get(keyword);
    }

    public String getOpt(Operator equal) {
        return null;
    }


    protected enum FunctionName {
        CONCAT
    }

    private final Map<Keyword, String> keywordMap = new HashMap<>();
    private final Map<Operator, String> operatorMap = new HashMap<>();
    private final Map<FunctionName, SQLFunction> functionMap = new HashMap<>();

    protected void addFunction(FunctionName functionName, SQLFunction function) {
        functionMap.put(functionName, function);
    }

    protected void addKeyWord(Keyword Keyword, String s) {
        keywordMap.put(Keyword, s);
    }

    protected void addOperator(Operator opt, String s) {
        operatorMap.put(opt, s);
    }

    protected SQLTemplates() {
        addKeyWord(SELECT, "SELECT");
        addKeyWord(FROM, "FROM");
        addKeyWord(WHERE, "WHERE");
        addKeyWord(AND, "AND");
        addKeyWord(OR, "OR");
        addKeyWord(DISTINCT, "DISTINCT");
//
//        addFunction(FunctionName.CONCAT, new ConcatFunction1());
        addOperator(Operator.EQUAL, "=");
    }

    public String select() {
        return keywordMap.get(SELECT);
    }


    public String from() {
        return keywordMap.get(Keyword.FROM);
    }

}
