package com.kekwy.sqlni.annotationTest;

import com.kekwy.sqlni.annotation.MapperMethod;
import com.kekwy.sqlni.annotation.MapperProvider;
import com.kekwy.sqlni.annotation.Param;
import com.kekwy.sqlni.entity.Employee;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.SelectModel;

import java.util.List;
import java.util.Set;

import static com.kekwy.sqlni.SqlBuilder.*;


/**
 * 开发过程中用于调试的测试类
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/7 9:31
 */
@MapperProvider(Employee.class)
public class EmployeeMapperProvider {

    /**
     * 获取指定员工类型且 {部门}_{姓名} 在所给集合中的员工
     */
    @MapperMethod(
            params = {
                    @Param(name = "employeeType", type = {String.class}),
                    @Param(name = "departmentNameSet", type = {Set.class, String.class})
            },
            resultType = {List.class, Employee.class}
    )
    public String getEmployeeInfo() {

        return selectAll()
                .from(table("t_employee"))
                .where(column("type"), isEqualTo(param("employeeType")))
                .and(
                        concat(column("department"),
                                stringConstant("_"), column("name")),
                        isIn(collection("departmentNameSet")))
                .build()
                .render(RenderingStrategies.MYBATIS3).getSelectStatement(); // 在修改 Mybatis Dynamic SQL 的源码后考虑优化
    }




    /* 该部分代码考虑使用注解处理器自动生成
     * ----------------------------------------------------------------------- */

//    public static final Parameter<String> employeeType = new Parameter<>("employeeType");
//
//    public static final EmployeeTable employeeTable = new EmployeeTable();
//    public static final SqlColumn<Integer> eid = employeeTable.eid;
//    public static final SqlColumn<String> type = employeeTable.type;
//    public static final SqlColumn<String> name = employeeTable.name;
//    public static final SqlColumn<String> department = employeeTable.department;
//
//
//    public static final class EmployeeTable extends SqlTable {
//        public final SqlColumn<Integer> eid = column("eid");
//        public final SqlColumn<String> type = column("type");
//        public final SqlColumn<String> name = column("name");
//        public final SqlColumn<String> department = column("department");
//
//
//        public EmployeeTable() {
//            super("t_employee");
//        }
//    }
    /* ----------------------------------------------------------------------- */
}
