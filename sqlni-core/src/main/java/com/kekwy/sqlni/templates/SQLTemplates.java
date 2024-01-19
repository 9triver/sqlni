package com.kekwy.sqlni.templates;

import com.kekwy.sqlni.XMLElement;
import com.kekwy.sqlni.templates.function.SQLFunction;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用 SQL 语句的模板
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 14:28
 */
public abstract class SQLTemplates {

    protected enum KeyWord {
        SELECT,
        FROM,
        WHERE
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
        addKeyWord(KeyWord.SELECT, "select");
        addKeyWord(KeyWord.FROM, "from");
//
//        addFunction(FunctionName.CONCAT, new ConcatFunction1());
    }

    public String select() {
        return keyWordMap.get(KeyWord.SELECT);
    }


    public String from() {
        return keyWordMap.get(KeyWord.FROM);
    }


    public XMLElement concat(XMLElement... args) {
        return functionMap.get(FunctionName.CONCAT).apply(args);
    }
}
