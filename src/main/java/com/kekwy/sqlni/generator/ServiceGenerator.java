package com.kekwy.sqlni.generator;

import com.kekwy.sqlni.util.DateTimeUtil;
import com.kekwy.sqlni.util.DocCommentUtil;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.TypeElement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ServiceGenerator {

    private final ProcessingEnvironment processingEnv;
    private final TypeElement mapperElement;
    private final String entityName;
    private final Set<String> imports = new HashSet<>();

    public ServiceGenerator(ProcessingEnvironment processingEnv, TypeElement mapperElement, String entityName) {
        this.processingEnv = processingEnv;
        this.mapperElement = mapperElement;
        this.entityName = entityName;
    }

    public Map<String, Object> generate() {
        imports.add(entityName);
        Map<String, Object> model = new HashMap<>();
        model.put("time", DateTimeUtil.getNowDateTime());
        // 获取软件包名
        model.put("package", processingEnv.getElementUtils().getPackageOf(mapperElement)
                                     .getQualifiedName().toString() + ".mapper");
        model.put("serviceName", entityName.substring(entityName.lastIndexOf(".") + 1) + "Service");
        model.put("entityName", entityName.substring(entityName.lastIndexOf(".") + 1));
        // 获取 Mapper 接口上的文档注释
        model.put("serviceComment", DocCommentUtil.processDocComment(processingEnv.getElementUtils()
                .getDocComment(mapperElement)));
        model.put("imports", imports);
        return model;
    }
}
