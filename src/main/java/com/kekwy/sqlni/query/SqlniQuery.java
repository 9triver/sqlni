package com.kekwy.sqlni.query;

import com.kekwy.sqlni.expression.Expression;
import com.kekwy.sqlni.expression.TableExpression;
import org.dom4j.Element;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/7 9:13
 */
public class SqlniQuery {

    public SqlniQuery(Element document) {

    }

    public SqlniQuery selectAll() {
        return this;
    }

    public SqlniQuery from(TableExpression tableExpression) {
        return this;
    }

    public SqlniQuery where(Expression expression) {
        return this;
    }

    public SqlniQuery limit(Integer i) {
        return this;
    }

    public SqlniQuery from(String tableName) {
        return this;
    }

    enum Method {
        SELECT,
        UPDATE
    }

}
