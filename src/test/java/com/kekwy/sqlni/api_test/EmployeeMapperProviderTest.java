package com.kekwy.sqlni.api_test;

import org.junit.Test;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/11 11:29
 */
public class EmployeeMapperProviderTest {

    @Test
    public void getEmployeeInfo() {

        EmployeeMapperProvider provider = new EmployeeMapperProvider();
        System.out.println(provider.getEmployeeInfo());

    }
}