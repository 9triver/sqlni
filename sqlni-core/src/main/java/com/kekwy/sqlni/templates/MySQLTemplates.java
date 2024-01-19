package com.kekwy.sqlni.templates;

import com.kekwy.sqlni.templates.function.ConcatFunction1;

/**
 * 支持 MySQL 方言的 SQL 模板
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 14:28
 */
public class MySQLTemplates extends SQLTemplates {

    public MySQLTemplates() {
        addFunction(FunctionName.CONCAT, new ConcatFunction1());
    }
}
