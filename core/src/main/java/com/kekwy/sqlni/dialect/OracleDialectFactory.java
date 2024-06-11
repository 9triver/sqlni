package com.kekwy.sqlni.dialect;

import com.github.drinkjava2.jdialects.Dialect;

public class OracleDialectFactory implements DialectFactory {

    @Override
    public Dialect createDialect() {
        return Dialect.Oracle8iDialect;
    }

}
