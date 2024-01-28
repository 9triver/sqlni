package com.kekwy.sqlni.test;

import com.querydsl.sql.OracleTemplates;
import com.querydsl.sql.SQLQuery;
import org.junit.Test;

import static com.querydsl.core.types.dsl.Expressions.stringTemplate;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/28 11:44
 */
public class QueryDSLTest {

    @Test
    public void sqlTemplatesTest() {
        SQLQuery<?> query = new SQLQuery<>(new OracleTemplates());
        System.out.println(query.select(stringTemplate("a"), stringTemplate("b"))
                .from(stringTemplate("t_table"))
                .where(stringTemplate("c").eq(stringTemplate("234")))
                .limit(123)
                .offset(23423)
                .getSQL().getSQL());

    }

}
