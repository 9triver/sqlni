package com.kekwy.sqlni;

import org.mybatis.dynamic.sql.BindableColumn;
import org.mybatis.dynamic.sql.render.TableAliasCalculator;

import java.util.Objects;
import java.util.Optional;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/11 1:15
 */
public class Parameter<T> implements BindableColumn<T> {
    private final String name;

    public Parameter(String name) {
        this.name = Objects.requireNonNull(name);
    }

    @Override
    public Optional<String> alias() {
        return Optional.empty();
    }

    @Override
    public String renderWithTableAlias(TableAliasCalculator tableAliasCalculator) {
        return "#{" //$NON-NLS-1$
                + name
                + "}"; //$NON-NLS-1$
    }

    @Override
    public Parameter<T> as(String alias) {
        return new Parameter<>(name);
    }

    public static <T> Parameter<T> of(String name) {
        return new Parameter<>(name);
    }

}
