package com.kekwy.sqlni.expression;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/7 17:57
 */
public class TableExpression extends Expression {

    private String tableName;

    public TableExpression(String tableName) {
        super(Type.TABLE);
        this.tableName = tableName;
    }

    @Override
    public String toString() {
        return tableName;
    }
}
