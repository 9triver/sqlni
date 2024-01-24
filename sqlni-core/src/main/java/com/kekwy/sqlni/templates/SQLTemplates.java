package com.kekwy.sqlni.templates;

import com.kekwy.sqlni.node.Node;
import com.kekwy.sqlni.node.TextNode;
import com.kekwy.sqlni.templates.function.SQLFunction;

import java.util.*;

import static com.kekwy.sqlni.templates.SQLTemplates.KeyWord.*;

/**
 * 通用 SQL 语句的模板
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 14:28
 */
public abstract class SQLTemplates {


    public String distinct() {
        return keyWordMap.get(KeyWord.DISTINCT);
    }

    public String where() {
        return keyWordMap.get(WHERE);
    }

    public List<Node> limit(String limitN, String offsetN) {
        return List.of(new TextNode("limit " + limitN + " offset " + offsetN));
    }

    public List<Node> limit(String limitN) {
        return List.of(new TextNode("limit " + limitN));
    }

    public List<Node> func(String func, List<Node> columns) {
        if (Objects.equals(func, "concat")) return concat(columns);
        return null;
    }

    abstract public List<Node> concat(List<Node> columns);

    public String and() {
        return keyWordMap.get(AND);
    }

    public String or() {
        return keyWordMap.get(OR);
    }

    public List<Node> isEqualTo(List<Node> left, List<Node> right) {
        List<Node> nodes = new LinkedList<>(left);
        nodes.add(new TextNode("="));
        nodes.addAll(right);
        return nodes;
    }

    public List<Node> isNotEqualTo(List<Node> left, List<Node> right) {
        List<Node> nodes = new LinkedList<>(left);
        nodes.add(new TextNode("!="));
        nodes.addAll(right);
        return nodes;
    }

    public List<Node> isLessThan(List<Node> left, List<Node> right) {
        List<Node> nodes = new LinkedList<>(left);
        nodes.add(new TextNode("<"));
        nodes.addAll(right);
        return nodes;
    }

    public List<Node> isLessThanOrEqualTo(List<Node> left, List<Node> right) {
        List<Node> nodes = new LinkedList<>(left);
        nodes.add(new TextNode("<="));
        nodes.addAll(right);
        return nodes;
    }

    public List<Node> isGreaterThan(List<Node> left, List<Node> right) {
        List<Node> nodes = new LinkedList<>(left);
        nodes.add(new TextNode(">"));
        nodes.addAll(right);
        return nodes;
    }

    public List<Node> isGreaterThanOrEqualTo(List<Node> left, List<Node> right) {
        List<Node> nodes = new LinkedList<>(left);
        nodes.add(new TextNode(">="));
        nodes.addAll(right);
        return nodes;
    }

    protected enum KeyWord {
        SELECT,
        FROM,
        WHERE,
        AND,
        OR,
        DISTINCT
    }

    protected enum FunctionName {
        CONCAT
    }

    private final Map<KeyWord, String> keyWordMap = new HashMap<>();

    private final Map<FunctionName, SQLFunction> functionMap = new HashMap<>();

    protected void addFunction(FunctionName functionName, SQLFunction function) {
        functionMap.put(functionName, function);
    }

    protected void addKeyWord(KeyWord keyWord, String s) {
        keyWordMap.put(keyWord, s);
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
    }

    public String select() {
        return keyWordMap.get(SELECT);
    }


    public String from() {
        return keyWordMap.get(KeyWord.FROM);
    }

}
