package com.kekwy.sqlni.dialect;

import com.github.drinkjava2.jdialects.Dialect;

public class MySQLDialectFactory implements DialectFactory {
    @Override
    public Dialect createDialect() {
        return Dialect.MySQLDialect;
    }
}
