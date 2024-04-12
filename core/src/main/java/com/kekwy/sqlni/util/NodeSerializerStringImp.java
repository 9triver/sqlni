package com.kekwy.sqlni.util;

import org.apache.commons.text.StringEscapeUtils;

import java.util.List;
import java.util.Map;

public class NodeSerializerStringImp implements NodeSerializer {

    private final int layer;
    private final List<String> buffer;

    public NodeSerializerStringImp(int layer, List<String> buffer) {
        this.layer = layer;
        this.buffer = buffer;
    }

    @Override
    public NodeSerializer addElement(String name, Map<String, String> attributes) {
        StringBuilder builder = new StringBuilder("  ".repeat(layer)).append("<").append(name);
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            builder.append(" ").append(entry.getKey())
                    .append("=")
                    .append("\"").append(entry.getValue()).append("\"");
        }
        builder.append(">");
        buffer.add(builder.toString());
        return new NodeSerializerStringImp(layer + 1, buffer);
    }

    @Override
    public void finishElement(String name) {
        buffer.add("  ".repeat(layer) + "</" + name + ">");
    }

    @Override
    public void addText(String text) {
        for (String s : text.split("\n")) {
            String trim = s.trim();
            if (!trim.isEmpty()) {
                // 将 text 中出现的特殊字符根据 XML 语法规则进行转义
                buffer.add("  ".repeat(layer) + StringEscapeUtils.escapeXml11(trim));
            }
        }
    }

}
