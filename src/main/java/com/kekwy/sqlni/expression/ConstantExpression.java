package com.kekwy.sqlni.expression;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/7 19:16
 */
public class ConstantExpression extends Expression {

    private final String value;

    public ConstantExpression(String value) {
        super(Type.CONSTANT);
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
