package com.kekwy.sqlni.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/7 21:57
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Param {

    /**
     * 参数名
     */
    String name();

    /**
     * 参数类型
     */
    Class<?>[] type() default Object.class;

//    String value();

}
