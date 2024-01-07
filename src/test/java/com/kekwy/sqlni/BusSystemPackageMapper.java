package com.kekwy.sqlni;

import com.kekwy.sqlni.element.SqlniCollection;
import com.kekwy.sqlni.element.SqlniVariable;
import com.kekwy.sqlni.expression.VariableExpression;
import com.kekwy.sqlni.mapper.SqlniMapper;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.EntityPath;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.QList;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.sql.SQLExpressions;
import com.querydsl.sql.SQLQuery;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/7 9:31
 */
public class BusSystemPackageMapper extends SqlniMapper {

    //    @MapperMethod
    public void getBasecellinfos(VariableExpression subKey) {

        selectAll()
                .from(table("s_basecellinfo"))
                .where(column("subkey").eq(subKey))
                .limit(1);

    }

    private EntityPathBase<?> column(String columnName) {
        return new EntityPathBase<>(Object.class, columnName);
    }

}
