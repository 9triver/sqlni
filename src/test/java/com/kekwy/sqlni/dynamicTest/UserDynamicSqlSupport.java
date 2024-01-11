package com.kekwy.sqlni.dynamicTest;


import org.junit.Test;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.render.TableAliasCalculator;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;

import java.sql.JDBCType;
import java.util.*;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.mybatis.dynamic.sql.SqlBuilder.constant;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/10 13:54
 */


public class UserDynamicSqlSupport {

    public static final User user = new User();
    public static final SqlColumn<Integer> id = user.id;
    public static final SqlColumn<String> username = user.username;
    public static final SqlColumn<String> email = user.email;


    public static final class User extends SqlTable {
        public final SqlColumn<Integer> id = column("uid", JDBCType.INTEGER);
        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);
        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public User() {
            super("t_user");
        }
    }

    static class IntegerConstant implements BindableColumn<Integer> {

        private final String alias;
        private final Integer value;

        public IntegerConstant(Integer value) {
            this(value, null);
        }

        private IntegerConstant(Integer value, String alias) {
            this.value = Objects.requireNonNull(value);
            this.alias = alias;
        }

        @Override
        public Optional<String> alias() {
            return Optional.ofNullable(alias);
        }

        @Override
        public String renderWithTableAlias(TableAliasCalculator tableAliasCalculator) {
            return value.toString(); //$NON-NLS-1$ //$NON-NLS-2$
        }

        @Override
        public IntegerConstant as(String alias) {
            return new IntegerConstant(value, alias);
        }

    }

    @Test
    public void testGeneralSelect() {

//        Set<String> set = new HashSet<>();
        int num = 1;


        SelectStatementProvider selectStatement = select(id, username, email)
                .from(user)
                .where(id, isEqualTo(new IntegerConstant(1)))
                .and(username, isIn("name", "password"))
                .or(email, isEqualTo(concat(id, stringConstant("_"), username)))
                .build()
                .render(RenderingStrategies.MYBATIS3);
//        SqlEx

        System.out.println(selectStatement.getSelectStatement());

    }

//    private SqlCriterion buildNameDepartmentCondition(Set<String> nameDepartmentSet) {
//        if (nameDepartmentSet != null && !nameDepartmentSet.isEmpty()) {
//            StringJoiner joiner = new StringJoiner(" or ");
//            for (String nd : nameDepartmentSet) {
//                joiner.add("name || '_' || department = '" + nd + "'");
//            }
//            concatenate(id, stringConstant("_"), username);
//            return condition(joiner.toString());
//        }
//        return null;
//    }
}

