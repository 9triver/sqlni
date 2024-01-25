package com.kekwy.sqlni.templates;

/**
 * 支持 Oracle 方言的 SQL 模板
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/24 14:50
 */
public class OracleTemplates extends SQLTemplates {

    public OracleTemplates() {
        super("Oracle");
        addFuncTemplate("concat", "({0} || ...)");
        addFuncTemplate("limit", "FETCH FIRST {0} ROWS ONLY");
        addFuncTemplate("limitWithOffset", "OFFSET {1} ROWS FETCH NEXT {0} ROWS ONLY");
    }

}
