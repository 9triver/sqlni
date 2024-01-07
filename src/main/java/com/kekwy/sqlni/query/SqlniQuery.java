package com.kekwy.sqlni.query;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/7 9:13
 */
public class SqlniQuery {

    public SqlniQuery selectAll() {
        return this;
    }

    public SqlniQuery from() {
        return this;
    }

    public SqlniQuery where() {
        return this;
    }

    public SqlniQuery limit() {
        return this;
    }

    enum Method {
        SELECT,
        UPDATE
    }

}
