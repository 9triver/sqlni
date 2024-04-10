package com.kekwy.sqlni.test;

import com.github.drinkjava2.jdialects.Dialect;
import org.junit.Test;

public class JDialectsTest {

    @Test
    public void test() {
//        System.out.println(Dialect.Oracle12cDialect.sqlTemplate);

//        System.out.println(Dialect.Oracle12cDialect.trans("update t_table set c1=concat(2 , '2'), c2=4 where 1=1   "));
//        System.out.println(Dialect.Oracle12cDialect.paginAndTrans(3, 3, "SELECT * from t_table AS t where MIF(concat('sadfa', SQLNI_ARRAY_sadfasdf, '1312')='sdfsdfdsfds', c1 = [#{param1}], 1=1) and c2 <> concat('sadfa', 'asdf', '1312')"));
        System.out.println(Dialect.Oracle8iDialect.limitAndTrans("#{param}", "3", "select * from t_table as t where c1 = 2"));
    }

}
