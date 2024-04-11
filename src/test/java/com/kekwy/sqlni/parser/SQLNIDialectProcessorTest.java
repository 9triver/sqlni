package com.kekwy.sqlni.parser;

import com.github.drinkjava2.jdialects.Dialect;
import com.github.drinkjava2.jdialects.SqlFormatter;
import org.junit.Test;

public class SQLNIDialectProcessorTest {

    @Test
    public void process() {
        String sql = new SQLNIDialectProcessor(Dialect.Oracle12cDialect).process("select * from (select c1, c2 from t_table where concat('asdf', ${str}, col)='123') tmp where c1=concat(#{param}, 'asdf')");
        sql = new SQLNIXMLProcessor().process(sql);
        System.out.println(SqlFormatter.format(sql));
    }
}