package com.kekwy.sqlni.parser;

public class SQLNIXMLProcessor {



    public String process(String statement) {
        statement = new ToParamTranslator().trans(statement); // 还原变量
        // 解析 MyBatis 的标签

        return statement;
    }



}
