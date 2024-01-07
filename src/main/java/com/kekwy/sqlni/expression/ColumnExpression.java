package com.kekwy.sqlni.expression;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/7 19:17
 */
public class ColumnExpression extends Expression {

    private final String columnName;


    public ColumnExpression(String columnName) {
        super(Type.COLUMN);
        this.columnName = columnName;
    }


    @Override
    public String toString() {
        return columnName;
    }
}
