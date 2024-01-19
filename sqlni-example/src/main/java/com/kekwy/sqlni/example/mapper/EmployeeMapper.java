package com.kekwy.sqlni.example.mapper;

import com.kekwy.sqlni.UseSQLNI;
import com.kekwy.sqlni.example.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 10:20
 */
@Mapper
public interface EmployeeMapper {

    @UseSQLNI("""
            SELECT *
            FROM t_employee;
            """)
    List<Employee> getEmployees();

}
