package com.kekwy.sqlni;

import org.dom4j.Document;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 11:27
 */

public record Mapper(String packageName, String mapperName, Document document) {
}
