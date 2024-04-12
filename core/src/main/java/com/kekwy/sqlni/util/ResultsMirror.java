package com.kekwy.sqlni.util;

import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.ExecutableElement;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ResultsMirror {

    private String id;
    private final List<ResultMirror> value = new LinkedList<>();

    @SuppressWarnings("unchecked")
    public ResultsMirror(AnnotationMirror annotationMirror) {
        for (Map.Entry<? extends ExecutableElement, ? extends AnnotationValue> entry
                : annotationMirror.getElementValues().entrySet()) {
            ExecutableElement key = entry.getKey();
            AnnotationValue value = entry.getValue();
            String fieldName = key.getSimpleName().toString();
            Object fieldValue = value.getValue();
            if (fieldName.equals("id")) {           // results.id();
                this.id = (String) fieldValue;
            } else if (fieldName.equals("value")) { // results.value();
                processResults((List<AnnotationMirror>) fieldValue);
            }
        }
    }

    private void processResults(List<AnnotationMirror> results) {
        for (AnnotationMirror result : results) {
            value.add(new ResultMirror(result));
        }
    }

    public String id() {
        return this.id;
    }

    public List<ResultMirror> value() {
        return this.value;
    }

}
