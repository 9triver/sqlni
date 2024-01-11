package com.kekwy.sqlni.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/10 18:01
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface MapperProvider {

    Class<?> entity();

    String namespace();

}
