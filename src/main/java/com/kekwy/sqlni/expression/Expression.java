package com.kekwy.sqlni.expression;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/7 17:52
 */
public abstract class Expression {

    public Expression eq(Expression subKey) {
        return null;
    }

    enum Type {
        CONSTANT,
        COLUMN,
        TABLE,
        VARIABLE
    }

    Type type;

    public Expression(Type type) {
        this.type = type;
    }

    @Override
    public abstract String toString();

}
