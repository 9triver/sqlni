package com.kekwy.sqlni.generator;


import com.kekwy.sqlni.util.DateTimeUtil;
import com.kekwy.sqlni.util.DocCommentUtil;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.*;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapperGenerator {

    private final ProcessingEnvironment processingEnv;

    private final TypeElement mapperElement;

    private final String entityName;

    private final Set<String> imports = new HashSet<>();


    public MapperGenerator(ProcessingEnvironment processingEnv, TypeElement mapperElement, String entityName) {
        this.processingEnv = processingEnv;
        this.mapperElement = mapperElement;
        this.entityName = entityName;
    }

    private final Pattern TYPE_PATTERN = Pattern.compile("(.+)?<(.+)?>");

    private String processTypeHelper(String type) {
        String res;
        Matcher matcher = TYPE_PATTERN.matcher(type);
        if (matcher.find()) {
            String t = matcher.group(1);
            imports.add(t);
            res = t.substring(t.lastIndexOf(".") + 1);
            res += "<";
            res += processTypeHelper(matcher.group(2));
            res += ">";
            return res;
        } else {
            imports.add(type);
            res = type.substring(type.lastIndexOf(".") + 1);
        }
        return res;
    }

    private String processType(TypeMirror type) {
        if (type.getKind().isPrimitive()) return type.toString(); // 避免将基元类型加入 import 语句
        return processTypeHelper(type.toString());
    }

    public Map<String, Object> generate() {
        Map<String, Object> model = new HashMap<>();
        imports.add(entityName);
        model.put("time", DateTimeUtil.getNowDateTime());
        // 获取软件包名
        model.put("package", processingEnv.getElementUtils().getPackageOf(mapperElement)
                                     .getQualifiedName().toString() + ".mapper");
        model.put("mapperName", entityName.substring(entityName.lastIndexOf(".") + 1) + "Mapper");
        model.put("entityName", entityName.substring(entityName.lastIndexOf(".") + 1));
        // 获取 Mapper 接口上的文档注释
        model.put("mapperComment", DocCommentUtil.processDocComment(processingEnv.getElementUtils()
                .getDocComment(mapperElement)));
        // 处理方法
        List<Method> methods = new ArrayList<>();
        for (Element element : mapperElement.getEnclosedElements()) {
            if (element.getKind() == ElementKind.METHOD
                && element instanceof ExecutableElement methodElement) {
                String[] comment = DocCommentUtil.processDocComment(processingEnv.getElementUtils()
                        .getDocComment(methodElement));
                String returnType = processType(methodElement.getReturnType());
                String name = methodElement.getSimpleName().toString();
                Method method = new Method(comment, returnType, name);
                for (VariableElement parameter : methodElement.getParameters()) {
                    method.addParameter(parameter.getSimpleName().toString(), processType(parameter.asType()));
                }
                methods.add(method);
            }
        }
        model.put("imports", imports);
        model.put("methods", methods);

        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, model.toString());

        return model;
    }

    public static class Method {

        String[] comment;
        String returnType;
        String name;
        List<Parameter> parameters = new ArrayList<>();

        public Method(String[] comment, String returnType, String name) {
            this.comment = comment;
            this.returnType = returnType;
            this.name = name;
        }

        public void addParameter(String parameterName, String type) {
            parameters.add(new Parameter(parameterName, type));
        }

        public String[] getComment() {
            return comment;
        }

        public String getReturnType() {
            return returnType;
        }

        public String getName() {
            return name;
        }

        public List<Parameter> getParameters() {
            return parameters;
        }

        @Override
        public String toString() {
            return "Method{" +
                   "comment=" + Arrays.toString(comment) +
                   ", returnType='" + returnType + '\'' +
                   ", name='" + name + '\'' +
                   ", parameters=" + parameters +
                   '}';
        }

        public static class Parameter {
            String name;
            String type;

            public Parameter(String name, String type) {
                this.name = name;
                this.type = type;
            }

            public String getName() {
                return name;
            }

            public String getType() {
                return type;
            }

            @Override
            public String toString() {
                return "Parameter{" +
                       "name='" + name + '\'' +
                       ", type='" + type + '\'' +
                       '}';
            }
        }

    }

}
