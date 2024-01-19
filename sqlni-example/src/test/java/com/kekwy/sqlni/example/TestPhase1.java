package com.kekwy.sqlni.example;

import com.kekwy.sqlni.example.mapper.EmployeeMapper;
import com.kekwy.sqlni.example.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/19 21:20
 */
public class TestPhase1 {



    @Test
    public void test01() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        System.out.println(mapper.getEmployees());
        sqlSession.close();
    }

}
