package com.kekwy.sqlni.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kekwy.sqlni.example.entity.Employee;
import com.kekwy.sqlni.example.entity.EmployeeGroup;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface EmployeeGroupMapper extends BaseMapper<EmployeeGroup> {

    @Results(
            id = "res1",
            value = {
            @Result(property = "gid", column = "gid"),
            @Result(property = "name", column = "name"),
            @Result(property = "members", column = "gid",
                    many = @Many(
                            select = "com.kekwy.sqlni.example.mapper.EmployeeMapper.getEmployeeByGid"
                    ))}
    )
    @Select("""
            select * from t_emp_g where gid=#{gid};
            """)
    EmployeeGroup getEmployeeGroupByGid(Integer gid);

    @ResultMap("res1")
    @Select("""
            select * from t_emp_g where gid in ( #foreach(#{gidList}) );
            """)
    List<EmployeeGroup> getEmployeeGroupsByGid(List<Integer> gidList);

    String limitAndTrans(String offset , String limit, String... sql);

}


