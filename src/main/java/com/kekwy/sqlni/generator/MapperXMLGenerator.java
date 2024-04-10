package com.kekwy.sqlni.generator;

import com.github.drinkjava2.jdialects.Dialect;
import com.kekwy.sqlni.parser.SQLNIXMLProcessor;
import com.kekwy.sqlni.parser.SQLNIDialectProcessor;
import com.kekwy.sqlni.util.*;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapperXMLGenerator {

    private final ProcessingEnvironment processingEnv;
    private final TypeElement mapper;
    private final String entityName;
    private final Dialect dialect;

    public MapperXMLGenerator(ProcessingEnvironment processingEnv, TypeElement mapper, String entityName, Dialect dialect) {
        this.processingEnv = processingEnv;
        this.mapper = mapper;
        this.entityName = entityName;
        this.dialect = dialect;
    }

    public Map<String, Object> generate() {
        Map<String, Object> model = new HashMap<>();
        model.put("time", DateTimeUtil.getNowDateTime());
        String packageName = processingEnv.getElementUtils().getPackageOf(mapper).toString() + ".mapper";
        model.put("package", packageName);
        String mapperName = entityName.substring(entityName.lastIndexOf(".") + 1) + "Mapper";
        model.put("mapperName", mapperName);
        model.put("namespace", packageName + "." + mapperName); //
        model.put("resultMaps", generateResultMaps(mapper));    //
        model.put("methods", generateMethods(mapper));          //
        return model;
    }

    private List<ResultMapModel> generateResultMaps(TypeElement mapper) {
        List<ResultMapModel> res = new LinkedList<>();
        for (Element element : mapper.getEnclosedElements()) {
            if (element.getKind() == ElementKind.METHOD && element instanceof ExecutableElement methodElement) {
                // 找到方法上的 Results 注解，以及该注解对应的 MirrorType
                for (AnnotationMirror annotationMirror : methodElement.getAnnotationMirrors()) {
                    String annotationName = annotationMirror.getAnnotationType().asElement().asType().toString();
                    if (annotationName.equals(Results.class.getName())) {
                        res.add(new ResultMapModel(new ResultsMirror(annotationMirror),
                                processType(methodElement.getReturnType().toString())));
                    }
                }
            }
        }
        return res;
    }

    private List<MethodModel> generateMethods(TypeElement mapper) {
        List<MethodModel> res = new LinkedList<>();
        for (Element element : mapper.getEnclosedElements()) {
            if (element.getKind() == ElementKind.METHOD && element instanceof ExecutableElement methodElement) {
                String statement = "";
                String action = "";
                Select select = methodElement.getAnnotation(Select.class);
                Insert insert = methodElement.getAnnotation(Insert.class);
                Update update = methodElement.getAnnotation(Update.class);
                Delete delete = methodElement.getAnnotation(Delete.class);
                if (select != null) {
                    statement = select.value()[select.value().length - 1];
                    action = "select";
                } else if (insert != null) {
                    statement = insert.value()[insert.value().length - 1];
                    action = "insert";
                } else if (update != null) {
                    statement = update.value()[update.value().length - 1];
                    action = "update";
                } else if (delete != null) {
                    statement = delete.value()[delete.value().length - 1];
                    action = "delete";
                } else {
                    continue;
                }
                ResultMap resultMap = methodElement.getAnnotation(ResultMap.class);
                Results results = methodElement.getAnnotation(Results.class);
                String resultMapId = null;
                if (resultMap != null) {
                    resultMapId = resultMap.value()[resultMap.value().length - 1];
                } else if (results != null) {
                    resultMapId = results.id();
                }
                String[] comment = DocCommentUtil.processDocComment(processingEnv.getElementUtils()
                        .getDocComment(methodElement));
                res.add(new MethodModel(action,
                        processType(methodElement.getReturnType().toString()),
                        resultMapId, comment, statement, dialect));
            }
        }
        return res;
    }

    @SuppressWarnings("unused")
    public static class MethodModel {

        private final String action;
        private final String[] comment;
        private final String resultType;
        private final String resultMap;
        private final String statement;

        public MethodModel(String action, String resultType, String resultMap, String[] comment, String statement, Dialect dialect) {
            this.action = action;
            this.resultMap = resultMap;
            this.resultType = resultType;
            this.comment = comment;
            this.statement = new SQLNIXMLProcessor().process(new SQLNIDialectProcessor(dialect).process(statement));
        }

        public String getAction() {
            return action;
        }

        public String[] getComment() {
            return comment;
        }

        public String getResultType() {
            return resultType;
        }

        public String getResultMap() {
            return resultMap;
        }

        public String getStatement() {
            return statement;
        }
    }

    @SuppressWarnings("unused")
    public static class ResultMapModel {
        private String id = "";
        private final String type;
        private final List<Map<String, String>> idList = new LinkedList<>();
        private final List<Map<String, String>> resultList = new LinkedList<>();
        private final List<Map<String, String>> collectionList = new LinkedList<>();
        private final List<Map<String, String>> associationList = new LinkedList<>();

        public ResultMapModel(ResultsMirror results, String type) {
            this.id = results.id();
            this.type = type;
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


    }

    private static final Pattern TYPE_PATTERN = Pattern.compile("(.+)?<(.+)?>");

    private static String processType(String type) {
        Matcher matcher = TYPE_PATTERN.matcher(type);
        if (matcher.find()) {
            return matcher.group(2);
        } else {
            return type;
        }
    }


}
