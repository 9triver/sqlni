package com.kekwy.sqlni.util;

import com.github.drinkjava2.jdialects.Dialect;

import java.util.Map;

public class SQLDialectUtil {

    private static final Map<String, Dialect> dialectMap = Map.of(
            "MySQL", Dialect.MySQLDialect,
            "Oracle", Dialect.Oracle8iDialect
    );

    public static Dialect getDialect(String name) {
        return dialectMap.get(name);
    }

}
