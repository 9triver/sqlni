package com.kekwy.sqlni.util;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * JSON 工具类，用于 Json 字符串与 Java 对象间的互相转换
 *
 * @author Kekwy
 * @version 1.0
 * @since 2023/5/17 14:02
 */

public class JSONUtil {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static <T> T parseObject(String jsonString, Class<T> type) {
        try {
            return MAPPER.readValue(jsonString, type);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJSONString(Object value) {
        try {
            return MAPPER.writeValueAsString(value);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
