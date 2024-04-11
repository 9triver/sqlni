package com.kekwy.sqlni.parser;

import com.github.drinkjava2.jdialects.Dialect;
import com.github.drinkjava2.jdialects.SqlFormatter;
import org.junit.Test;

public class SQLNIDialectProcessorTest {

    @Test
    public void process() {
//        String sql = new SQLNIDialectProcessor(Dialect.Oracle12cDialect).process("select * from (select c1, c2 from t_table #if" +
//                                                                                 "where concat('asdf', mfor(${str}, ','), col)='123') tmp where c1=concat(#{param}, 'asdf')");

        System.out.println(Dialect.Oracle12cDialect.trans("select * from t_table #if(sadfasdf) \n" +
                                                      "where 1=1 #endif and concat('asdf', #for(sdfsd), '234')"));
//        sql = new SQLNIXMLProcessor().process(sql);
//        System.out.println(SqlFormatter.format(sql));
    }
}