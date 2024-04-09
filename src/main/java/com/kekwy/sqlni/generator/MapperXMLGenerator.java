package com.kekwy.sqlni.generator;

import com.kekwy.sqlni.templates.SQLTemplates;
import com.kekwy.sqlni.util.DateTimeUtil;
import com.kekwy.sqlni.util.ResultMirror;
import com.kekwy.sqlni.util.ResultsMirror;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.UnknownTypeHandler;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.*;
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
        for (Element element : mapper.getEnclosedElements()) {
            if (element.getKind() == ElementKind.METHOD && element instanceof ExecutableElement methodElement) {
                // 找到方法上的 Results 注解，以及该注解对应的 MirrorType
                for (AnnotationMirror annotationMirror : methodElement.getAnnotationMirrors()) {
                    String annotationName = annotationMirror.getAnnotationType().asElement().asType().toString();
                    if (annotationName.equals(Results.class.getName())) {
                        res.add(new ResultMap(new ResultsMirror(annotationMirror), methodElement.getReturnType().toString()));
                    }
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

    @SuppressWarnings("unused")
    public static class ResultMap {
        private String id = "";
        private final String type;
        private final List<Map<String, String>> idList = new LinkedList<>();
        private final List<Map<String, String>> resultList = new LinkedList<>();
        private final List<Map<String, String>> collectionList = new LinkedList<>();
        private final List<Map<String, String>> associationList = new LinkedList<>();

        public ResultMap(ResultsMirror results, String type) {
            this.id = results.id();
            this.type = processType(type);
            for (ResultMirror result : results.value()) {
                Map<String, String> map = new HashMap<>();
                map.put("column", result.column());
                map.put("property", result.property());
                map.put("javaType", result.javaType());
                map.put("jdbcType", result.jdbcType());
                map.put("typeHandler", result.typeHandler());
                if (result.id()) {
                    idList.add(map);
                } else if (result.one() != null) {
                    map.put("select", result.one().select());
                    map.put("fetchType",
                            result.one().fetchType() == null
                            || Objects.equals(result.one().fetchType(), FetchType.DEFAULT.toString()) ?
                                    null : result.one().fetchType().toLowerCase());
                    associationList.add(map);
                } else if (result.many() != null) {
                    map.put("select", result.many().select());
                    map.put("fetchType",
                            result.many().fetchType() == null
                            || Objects.equals(result.many().fetchType(), FetchType.DEFAULT.toString()) ?
                                    null : result.many().fetchType().toLowerCase());
                    collectionList.add(map);
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

        private String processType(String type) {
            Matcher matcher = TYPE_PATTERN.matcher(type);
            if (matcher.find()) {
                return matcher.group(2);
            } else {
                return type;
            }
        }

    }


}
