package com.kekwy.sqlni.generator;

import com.kekwy.sqlni.templates.SQLTemplates;
import com.kekwy.sqlni.util.DateTimeUtil;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.TypeElement;
import java.util.HashMap;
import java.util.Map;

public class MapperXMLGenerator {

    private final ProcessingEnvironment processingEnv;

    private final TypeElement mapper;

    private final String entityName;

    public MapperXMLGenerator(ProcessingEnvironment processingEnv, TypeElement mapper, String entityName, SQLTemplates sqlTemplates) {
        this.processingEnv = processingEnv;
        this.mapper = mapper;
        this.entityName = entityName;
    }

    public Map<String, Object> generate() {
        Map<String, Object> model = new HashMap<>();
        model.put("time", DateTimeUtil.getNowDateTime());
        String packageName = processingEnv.getElementUtils().getPackageOf(mapper).toString() + ".mapper";
        model.put("package", packageName);
        String mapperName = entityName.substring(entityName.lastIndexOf(".") + 1) + "Mapper";
        model.put("mapperName", mapperName);
        model.put("namespace", packageName + "." + mapperName);
//        model.put("root", new ElementNode("temp"));
        return model;
    }
}
