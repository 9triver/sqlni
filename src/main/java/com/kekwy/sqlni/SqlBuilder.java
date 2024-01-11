package com.kekwy.sqlni;

import com.kekwy.sqlni.templates.SQLTemplates;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.render.TableAliasCalculator;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.function.Concat;
import org.mybatis.dynamic.sql.where.condition.IsEqualTo;
import org.mybatis.dynamic.sql.where.condition.IsEqualToColumn;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * 向用户提供构建查询语句的 API
 * （该接口的功能依赖于接口 org.mybatis.dynamic.sql.SqlBuilder 实现）
 *
 * @author Kekwy
 * @version 1.0
 * @see org.mybatis.dynamic.sql.SqlBuilder
 * @since 2024/1/10 21:21
 */
public class SqlBuilder {

    /* templates (dialects)
     * ----------------------------------------------------------------------- */
    private static SQLTemplates templates;

    public static void setTemplates(SQLTemplates templates) {
        SqlBuilder.templates = templates;
    }

    /* table and column
     * ----------------------------------------------------------------------- */

    public static SqlTable table(String name) {
        return SqlTable.of(name);
    }

    public static <T> Constant<T> column(String name) {
        return Constant.of(name);
    }

    //    String name = "";


    /* parameters
     * ----------------------------------------------------------------------- */
    public static <T> Parameter<T> param(String name) {
        return Parameter.of(name);
    }

//    public static <T> Parameter<T> param(String name) {
//        return Parameter.of(name);
//    }
    public static <T> Constant<T> collection(String name) {
        return Constant.of(name);
    }

    /* constants
     * ----------------------------------------------------------------------- */

    public static <T> Constant<T> constant(String constant) {
        return Constant.of(constant);
    }

    public static StringConstant stringConstant(String constant) {
        return StringConstant.of(constant);
    }

    /* select
     * ----------------------------------------------------------------------- */

    public static QueryExpressionDSL.FromGatherer<SelectModel> selectAll() {
        return SelectDSL.select(new AllColumn());
    }

    /* conditions
     * ----------------------------------------------------------------------- */

    // isEqualTo
    public static <T> IsEqualTo<T> isEqualTo(T value) {
        return org.mybatis.dynamic.sql.SqlBuilder.isEqualTo(value);
    }

    public static <T> IsEqualToColumn<T> isEqualTo(BasicColumn column) {
        return org.mybatis.dynamic.sql.SqlBuilder.isEqualTo(column);
    }

    public static <T> IsEqualTo<T> isEqualTo(Supplier<T> valueSupplier) {
        return org.mybatis.dynamic.sql.SqlBuilder.isEqualTo(valueSupplier);
    }

    public static <T> IsInParamCollection<T> isIn(BasicColumn value) {
        return IsInParamCollection.of(value);
    }

    /* concat
     * ----------------------------------------------------------------------- */

    public static <T> Concat<T> concat(BindableColumn<T> firstColumn, BasicColumn... subsequentColumns) {
        return Concat.concat(firstColumn, subsequentColumns);
    }

    /* 内部类
     * ----------------------------------------------------------------------- */

    private static class AllColumn implements BasicColumn {

        @Override
        public Optional<String> alias() {
            return Optional.empty();
        }

        @Override
        public BasicColumn as(String alias) {
            return null;
        }

        @Override
        public String renderWithTableAlias(TableAliasCalculator tableAliasCalculator) {
            return "*";
        }

    }


}
