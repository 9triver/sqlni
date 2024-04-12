package com.kekwy.sqlni.generator;

import com.kekwy.sqlni.util.DateTimeUtil;
import com.kekwy.sqlni.util.DocCommentUtil;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.TypeElement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ServiceImplGenerator {


    private final ProcessingEnvironment processingEnv;
    private final TypeElement mapperElement;
    private final String entityName;
    private final Set<String> imports = new HashSet<>();

    public ServiceImplGenerator(ProcessingEnvironment processingEnv, TypeElement mapperElement, String entityName) {
        this.processingEnv = processingEnv;
        this.mapperElement = mapperElement;
        this.entityName = entityName;
    }

    public Map<String, Object> generate() {
        imports.add(entityName);
        Map<String, Object> model = new HashMap<>();
        model.put("time", DateTimeUtil.getNowDateTime());
        // 获取软件包名
        String packageName = processingEnv.getElementUtils().getPackageOf(mapperElement)
                .getQualifiedName().toString();
        model.put("package", packageName + ".service.impl");
        String entitySimpleName = entityName.substring(entityName.lastIndexOf(".") + 1);
        model.put("serviceName", entitySimpleName + "Service");
        model.put("mapperName", entitySimpleName + "Mapper");
        model.put("serviceImplName", entitySimpleName + "ServiceImpl");
        model.put("entityName", entitySimpleName);
        // 获取 Mapper 接口上的文档注释
        model.put("serviceImplComment", DocCommentUtil.processDocComment(processingEnv.getElementUtils()
                .getDocComment(mapperElement)));
        imports.add(packageName + ".mapper." + model.get("mapperName"));
        imports.add(packageName + ".service." + model.get("serviceName"));
        model.put("imports", imports);
        return model;
    }
}
