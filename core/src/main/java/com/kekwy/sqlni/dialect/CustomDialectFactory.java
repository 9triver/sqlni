package com.kekwy.sqlni.dialect;

import com.github.drinkjava2.jdialects.Dialect;
import com.github.drinkjava2.jdialects.Type;

public class CustomDialectFactory implements DialectFactory {
    @Override
    public Dialect createDialect() {
        Dialect dialect = new Dialect("CustomDialect");
        dialect.sqlTemplate = "select SKIP $skip_rows first $pagesize $BODY";
        dialect.typeMappings.put(Type.TIMESTAMP, "CustomTimeStamp");
        // some other settings
        return dialect;
    }
}
