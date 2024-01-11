package com.kekwy.sqlni.mapper;

import com.kekwy.sqlni.expression.ColumnExpression;
import com.kekwy.sqlni.expression.TableExpression;
import com.kekwy.sqlni.query.SqlniQuery;
import lombok.Data;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/7 9:15
 */

@Data
@Deprecated
//@MapperProvider
public abstract class BaseMapperProvider<T> {


    /* 该部分代码由注解处理器自动生成
     * ----------------------------------------------------------------------- */
    public static final EmployeeTable employeeTable = new EmployeeTable();
    public static final SqlColumn<Integer> eid = employeeTable.eid;
    public static final SqlColumn<String> type = employeeTable.type;
    public static final SqlColumn<String> name = employeeTable.name;
    public static final SqlColumn<String> department = employeeTable.department;


    public static final class EmployeeTable extends SqlTable {
        public final SqlColumn<Integer> eid = column("eid");
        public final SqlColumn<String> type = column("type");
        public final SqlColumn<String> name = column("name");
        public final SqlColumn<String> department = column("department");


        public EmployeeTable() {
            super("t_employee");
        }
    }
    /* ----------------------------------------------------------------------- */


    private SqlniQuery sqlniQuery;

//    protected final SqlniQuery selectAll() {
//
//        return sqlniQuery.selectAll();
//    }

    protected final void select(String... items) {

    }

    protected final void from(String tableName) {

    }

    protected final TableExpression table(String tableName) {
        return new TableExpression(tableName);
    }

    protected final ColumnExpression column(String columnName) {
        return new ColumnExpression(columnName);
    }


}
