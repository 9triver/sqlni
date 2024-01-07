package com.kekwy.sqlni.mapper;

import com.kekwy.sqlni.Conditions;
import com.kekwy.sqlni.query.SqlniQuery;
import com.querydsl.core.types.Expression;
import com.querydsl.sql.SQLQuery;
import lombok.Data;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/7 9:15
 */

@Data
public class SqlniMapper {

    private SqlniQuery sqlniQuery;


    protected final SQLQuery<?> selectAll() {
        return new SQLQuery<>();
    }

    protected final void select(String ...items) {

    }

    protected final void from(String tableName) {

    }

    protected final Conditions where() {
        return new Conditions();
    }


    protected final Expression<?> table(String tableName) {
        return null;
    }




}
