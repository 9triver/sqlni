package com.kekwy.sqlni;

import com.kekwy.sqlni.util.JSONUtil;
import org.mybatis.dynamic.sql.AbstractColumnComparisonCondition;
import org.mybatis.dynamic.sql.BasicColumn;

import java.util.Map;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/11 10:23
 */
public class IsInParamCollection<T> extends AbstractColumnComparisonCondition<T> {

    protected IsInParamCollection(BasicColumn value) {
        super(value);
    }

    @Override
    public String renderCondition(String leftColumn, String rightColumn) {

        MapperXMLElement element = new MapperXMLElement("foreach",
                Map.of(
                        "collection", rightColumn,
                        "index", "index",
                        "item", rightColumn+"Item",
                        "open", " ",
                        "close",  " ",
                        "separator", "or"
                ));


        return "#|" + "#&" + JSONUtil.toJSONString(element) + "#&" + leftColumn + "=#{" + rightColumn + "Item}" + "#|";
    }

    public static <T> IsInParamCollection<T> of(BasicColumn value) {
        return new IsInParamCollection<>(value);
    }

}
