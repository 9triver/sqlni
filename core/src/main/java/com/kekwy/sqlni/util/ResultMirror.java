package com.kekwy.sqlni.util;

import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.ExecutableElement;
import java.util.Map;

public class ResultMirror {

    private boolean id;
    private String column;
    private String property;
    private String javaType;
    private String jdbcType;
    private String typeHandler;
    private OneMirror one;
    private ManyMirror many;

    public ResultMirror(AnnotationMirror result) {
        for (Map.Entry<? extends ExecutableElement, ? extends AnnotationValue> entry
                : result.getElementValues().entrySet()) {
            ExecutableElement key = entry.getKey();
            AnnotationValue value = entry.getValue();
            String fieldName = key.getSimpleName().toString();
            Object fieldValue = value.getValue();
            switch (fieldName) {
                case "id" -> this.id = (boolean) fieldValue;
                case "column" -> this.column = (String) fieldValue;
                case "property" -> this.property = (String) fieldValue;
                case "javaType" -> this.javaType = fieldValue.toString();
                case "jdbcType" -> this.jdbcType = fieldValue.toString();
                case "typeHandler" -> this.typeHandler = fieldValue.toString();
                case "one" -> this.one = new OneMirror((AnnotationMirror) fieldValue);
                case "many" -> this.many = new ManyMirror((AnnotationMirror) fieldValue);
            }
        }
    }

    public boolean id() {
        return id;
    }

    public String column() {
        return column;
    }

    public String property() {
        return property;
    }

    public String javaType() {
        return javaType;
    }

    public String jdbcType() {
        return jdbcType;
    }

    public String typeHandler() {
        return typeHandler;
    }

    public OneMirror one() {
        return one;
    }

    public ManyMirror many() {
        return many;
    }
}
