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

    @Select("""
            select * from t_employee where eid = #{eid};
            """)
    Employee getEmployeeByEid(Integer eid);

    @Select("""
            select * from t_employee where gid = #{gid};
            """)
    Employee getEmployeeByGid(Integer gid);

    @Select("""
            select * from t_employee limit #{l}
            """)
    List<Employee> getEmployeeWithPage(int l, int o);


    @Select("""
            select * from t_employee where eid in ( #foreach(#{eid}) );
            """)
    List<Employee> getEmployeesByEid(List<Integer> eidList);


    /**
     * 选出指定的某些部门中工资最高的员工的姓名，
     * 选取其中工资最高的十名员工的部门和姓名并将其拼接。
     */
    @Select("""
            select concat(dept, '_', name) dept_name
            from t_employee
            where (dept, sal) in (
                select dept, max(sal) max_sal
                from t_employee
                where 1 = 1 #if(deptSet!=null) and dept in #foreach(#{deptSet}) #endif
                group by dept
            )
            order by sal
            limit 10;
            """)
    List<Employee> getEmployeeWithSubQuery(List<String> deptSet);

    /**
     * 用包含对象的属性值的集合作为方法的参数用以创建对象是一种很糟糕的做法，此处仅用于测试。
     */
    @Insert("""
            insert into t_employ values (#foreach(#{attributes}));
            """)
    boolean addEmployee(List<Object> attributes);

    @Update("""
            update t_employ
            set #if(employee.eid!=null) eid=#{employee.eid} #endif
            #if(employee.gid!=null) eid=#{employee.gid} #endif
            #if(employee.employeeName!=null) eid=#{employee.employeeName} #endif
            #if(employee.department!=null) eid=concat(#{employee.department}, '_', #{employee.name}) #endif
            #if(employee.salary!=null) eid=#{employee.salary} #endif
            where eid = #{eid};
            """)
    void updateEmployeeById(Employee employee, Integer eid);

//    Employee getEmployee

}
