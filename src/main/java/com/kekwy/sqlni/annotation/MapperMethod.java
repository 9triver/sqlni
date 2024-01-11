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
 * @since 2024/1/7 21:56
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MapperMethod {

    Param[] params();

    Class<?>[] resultType();

}
