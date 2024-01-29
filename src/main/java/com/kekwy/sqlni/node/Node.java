package com.kekwy.sqlni.node;

/**
 * 保存由 SQLNI 语句转化得到的 XML 数据及其结构
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/19 16:25
 */
public interface Node {

    void serialize(NodeSerializer serializer);

}
