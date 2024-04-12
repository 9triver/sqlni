package com.kekwy.sqlni.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kekwy.sqlni.example.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

//    @Select("""
//            select * from t_employee where eid = #{eid};
//            """)
//    Employee getEmployeeByEid(Integer eid);
//
//    @Select("""
//            select * from t_employee limit #{l} offset #{o}
//            """)
//    List<Employee> getEmployeeWithPage(int l, int o);
//
//
//    /**
//     * 选出指定某些部门中工资最高的员工的姓名
//     */
//    @Select("""
//            select employName
//            from t_employee
//            where (department, salary) in (
//                select department, max(salary) max_salary
//                from t_employee
//                where 1=1 #if(departmentSet!=null) department in #foreach(#{departmentSet}) #endif
//                group by department
//            );
//            """)
//    List<Employee> getEmployeeWithSubQuery(List<String> departmentSet);
//
//    /**
//     * 用包含对象的属性值的集合作为方法的参数用以创建对象是一种很糟糕的做法，此处仅用于测试。
//     */
//    @Insert("""
//            insert into t_employ values (#foreach(#{attributes}));
//            """)
//    boolean addEmployee(List<Object> attributes);

    @Update("""
            update t_employ
            set #if(employee.eid!=null) eid=#{employee.eid} #endif
            #if(employee.gid!=null) eid=#{employee.gid} #endif
            #if(employee.employeeName!=null) eid=#{employee.employeeName} #endif
            #if(employee.department!=null) eid=#{employee.department} #endif
            #if(employee.salary!=null) eid=#{employee.salary} #endif
            where eid = #{eid};
            """)
    void updateEmployeeById(Employee employee, Integer eid);

//    Employee getEmployee

}
