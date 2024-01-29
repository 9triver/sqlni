package com.kekwy.sqlni.templates;

/**
 * 支持 MySQL 方言的 SQL 模板
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 14:28
 */
public class MySQLTemplates extends SQLTemplates {

    public MySQLTemplates() {
        addFuncTemplate("concat", "concat({0}, ...)");
    }
}
