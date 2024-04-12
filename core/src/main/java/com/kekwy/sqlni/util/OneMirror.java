package com.kekwy.sqlni.util;

import org.jetbrains.annotations.NotNull;

import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.ExecutableElement;
import java.util.Map;

public class OneMirror {

    @NotNull
    private String select = "";
    private String fetchType;

    public OneMirror(AnnotationMirror one) {
        for (Map.Entry<? extends ExecutableElement, ? extends AnnotationValue> entry
                : one.getElementValues().entrySet()) {
            ExecutableElement key = entry.getKey();
            AnnotationValue value = entry.getValue();
            String fieldName = key.getSimpleName().toString();
            Object fieldValue = value.getValue();
            if (fieldName.equals("select")) {
                this.select = (String) fieldValue;
            } else if (fieldName.equals("fetchType")) {
                this.fetchType = fieldValue.toString();
            }
        }
    }


    public String select() {
        return select;
    }

    public String fetchType() {
        return fetchType;
    }
}
