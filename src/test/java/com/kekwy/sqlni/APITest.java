package com.kekwy.sqlni;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/17 18:40
 */
public class APITest {

    public void apiTest() {
        select().from(SqlTable.of("")).where(SqlColumn.of("", null), isEqualTo(""));
    }

}
