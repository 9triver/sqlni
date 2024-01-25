package com.kekwy.sqlni;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在 Mapper 的方法上添加该注解，并编写 SQLNI 语句。
 * 在项目编译时，将会根据用户编写的 SQLNI 语句以及指定的数据库类型，
 * 自动生成 Mapper 对应的 XML 映射文件。
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/11 16:36
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface UseSQLNI {

    String value();

}
