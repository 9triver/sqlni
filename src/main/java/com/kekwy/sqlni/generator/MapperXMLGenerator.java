package com.kekwy.sqlni.generator;

import com.kekwy.sqlni.templates.SQLTemplates;
import com.kekwy.sqlni.util.DateTimeUtil;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        model.put("namespace", packageName + "." + mapperName); //
        model.put("resultMaps", generateResultMap(mapper));     //
        model.put("methods", new ArrayList<>());                //
        return model;
    }

    public List<ResultMap> generateResultMap(TypeElement mapper) {
        List<ResultMap> res = new LinkedList<>();
        List<? extends Element> elements = mapper.getEnclosedElements();
        for (Element element : elements) {
            if (element.getKind() == ElementKind.METHOD && element instanceof ExecutableElement methodElement) {
                Results results = methodElement.getAnnotation(Results.class);
                if (results != null) {
                    res.add(new ResultMap(results, methodElement.getReturnType().toString()));
                }
            }
        }
        return res;
    }

    public static class Method {
        String[] comment;

        String resultType;

        String resultMap;

    }

    public static class ResultMap {
        private final String id;
        private final String type;
        private final List<Map<String, String>> idList = new LinkedList<>();
        private final List<Map<String, String>> resultList = new LinkedList<>();
        private final List<Map<String, String>> collectionList = new LinkedList<>();
        private final List<Map<String, String>> associationList = new LinkedList<>();

        public ResultMap(Results results, String type) {
            this.id = results.id();
            this.type = processTypeHelper(type);
            for (Result result : results.value()) {
                Map<String, String> map = Map.of(
                        "column", result.column(),
                        "property", result.property(),
                        "javaType", result.javaType().toString(),
                        "jdbcType", result.jdbcType().toString(),
                        "typeHandler", result.typeHandler().toString()
                );
                if (result.id()) {
                    idList.add(map);
                } else if (!result.one().select().isEmpty()) {

                } else if (!result.many().select().isEmpty()) {

                } else {
                    resultList.add(map);
                }
            }
        }

        public String getId() {
            return id;
        }

        public String getType() {
            return type;
        }

        public List<Map<String, String>> getIdList() {
            return idList;
        }

        public List<Map<String, String>> getResultList() {
            return resultList;
        }

        public List<Map<String, String>> getCollectionList() {
            return collectionList;
        }

        public List<Map<String, String>> getAssociationList() {
            return associationList;
        }


        private final Pattern TYPE_PATTERN = Pattern.compile("(.+)?<(.+)?>");

        private String processTypeHelper(String type) {
            Matcher matcher = TYPE_PATTERN.matcher(type);
            if (matcher.find()) {
                return matcher.group(2);
            } else {
                return type;
            }
        }

    }


}
