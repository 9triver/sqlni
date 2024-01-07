package com.kekwy.sqlni;

import com.querydsl.core.types.Ops;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.sql.MySQLTemplates;
import com.querydsl.sql.OracleTemplates;
import com.querydsl.sql.SQLQuery;
import org.junit.Test;



/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/7 9:29
 */
public class TestMain {

    @Test
    public void test() {
        SQLQuery<?> query = new SQLQuery<>(new OracleTemplates());
        OracleTemplates oracleTemplates = new OracleTemplates();
//        System.out.println(oracleTemplates.getTemplate(Ops.CONCAT));
        query.select(Expressions.stringTemplate(oracleTemplates.getTemplate(Ops.CONCAT),
                        Expressions.constant("Hello "),
                        Expressions.constant("World"),
                        Expressions.constant("sdfdsgdfg")))
                .from(Expressions.constant("dual")); // 使用 dual 作为示例表

        System.out.println(query.getSQL().getSQL());

    }

}
