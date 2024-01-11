package com.kekwy.sqlni.expression;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/7 19:17
 */
public class VariableExpression extends Expression {

    private final String variableName;

    public VariableExpression(String variableName) {
        super(Type.VARIABLE);
        this.variableName = variableName;
    }

    @Override
    public String toString() {
        return "#{" + variableName + "}";
    }
}
