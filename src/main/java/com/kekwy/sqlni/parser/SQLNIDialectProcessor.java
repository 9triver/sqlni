package com.kekwy.sqlni.parser;

import com.github.drinkjava2.jdialects.Dialect;

public class SQLNIDialectProcessor extends SQLNIBaseVisitor<String> {

    private String limit;
    private String offset;

    public String process(String statement, Dialect dialect) {

        return null;
    }

}
