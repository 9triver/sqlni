package com.kekwy.sqlni;

import com.kekwy.sqlni.testMapper.TestClass;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/8 17:56
 */
public class MapperProviderBuilderTest {


    @Test
    public void reflectionTest() {
        try {
            TestClass.class.getDeclaredMethods()[0].invoke(new TestClass(), new Object[]{new Object[]{"1+", "2"}});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void build() {

        new MapperXMLGenerator().buildMappers("com.kekwy.sqlni.testMapper", "./mappers");

    }


}