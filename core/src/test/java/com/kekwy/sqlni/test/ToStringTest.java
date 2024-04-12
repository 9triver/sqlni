package com.kekwy.sqlni.test;

import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.UnknownTypeHandler;
import org.junit.Test;

public class ToStringTest {

    @Test
    public void test1() {
        System.out.println(void.class.getName());
        System.out.println(JdbcType.UNDEFINED);
        System.out.println(UnknownTypeHandler.class.getName());
        System.out.println(FetchType.DEFAULT);
        System.out.println(ToStringTest.class.getTypeName());
    }

}
