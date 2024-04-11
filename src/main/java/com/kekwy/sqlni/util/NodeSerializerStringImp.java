package com.kekwy.sqlni.util;

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
            buffer.add("  ".repeat(layer) + s.trim());
        }
    }

}
