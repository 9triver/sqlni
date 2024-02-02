package com.kekwy.sqlni;

import com.kekwy.sqlni.mapper.Mapper;
import com.kekwy.sqlni.mapper.MapperBuilder;
import com.kekwy.sqlni.templates.SQLTemplates;
import com.kekwy.sqlni.util.SQLTemplatesUtil;
import com.kekwy.sqlni.util.Dom4jXMLUtil;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

/**
 * UseSQLNI 注解对应的处理器，在项目编译时执行，
 * 为用户在编译输出目录下对应的软件包中生成可被 Mybatis 直接使用的 XML 文件
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/11 17:03
 */
@SupportedAnnotationTypes({"com.kekwy.sqlni.UseSQLNI"}) // BUGFIX: 更改注解名未同步此处名称
@SupportedSourceVersion(SourceVersion.RELEASE_17)
public class UseSQLNIProcessor extends AbstractProcessor {

    private SQLTemplates sqlTemplates;

    /**
     * 从
     *
     * @param processingEnv environment to access facilities the tool framework
     *                      provides to the processor
     */
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        String sqlTemplatesName = processingEnv.getOptions().get("SQLTemplates");
        sqlTemplates = SQLTemplatesUtil.getTemplates(sqlTemplatesName);
    }

    /**
     * 建立每个 Mapper 到对应的 MapperBuilder 对象之间的映射
     */
    private final Map<String, MapperBuilder> builderMap = new HashMap<>();

    private void handleException(Exception e) {
        processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                "Error generating MyBatis XML file: " + e.getMessage() + "\n" +
                        "stackTrace: \n" +
                        Arrays.toString(e.getStackTrace())
        );
    }

    private Writer getFilePath(String packageName, String mapperName) throws IOException {
        Filer filer = processingEnv.getFiler();
        FileObject fileObject = filer.createResource(
                StandardLocation.CLASS_OUTPUT, packageName, mapperName + ".xml"
        );
        return fileObject.openWriter();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        // 注解处理结束
        if (roundEnv.processingOver()) {
            try {
                // 遍历上下文中所有的 mapperBuilder，生成用户定义的 mapper 所对应的 XML 文件
                for (MapperBuilder builder : builderMap.values()) {
                    Mapper mapper = builder.build();
                    Writer writer = getFilePath(mapper.packageName(), mapper.mapperName());
                    Dom4jXMLUtil.writeXMLFile(mapper.root(), writer);
                    writer.close();
                }
            } catch (IOException e) {
                handleException(e);
            }
            return false;
        }
        // 处理注解
        for (Element element : roundEnv.getElementsAnnotatedWith(UseSQLNI.class)) {

            if (element.getKind() == ElementKind.METHOD && element instanceof ExecutableElement methodElement) {
                UseSQLNI useSQLNIAnnotation = methodElement.getAnnotation(UseSQLNI.class);
                // 获取 Sqlni 语句
                String statement = useSQLNIAnnotation.value();

                // 获取Mapper接口的类名和方法名
                String className = ((TypeElement) methodElement.getEnclosingElement()).getQualifiedName().toString();
                String methodName = methodElement.getSimpleName().toString();

                // 获取上下文中已存在的对应 Mapper 的 builder 对象，若不存在则创建
                MapperBuilder builder;
                if (!builderMap.containsKey(className)) {
                    builder = new MapperBuilder(className, sqlTemplates);
                    builderMap.put(className, builder);
                } else {
                    builder = builderMap.get(className);
                }
                String resultType = methodElement.getReturnType().toString();
                // 添加方法并设置 resultType 和 statement
                // TODO: 处理 resultMap 的情况
//                Map<String, String> parameterTypeMap = buildParameterTypeMap(methodElement.getParameters());
                
                builder.addMethod(methodName)
                        .resultType(resultType)
                        .statement(statement);
            }
        }
        return true;
    }

//    private Map<String, String> buildParameterTypeMap(List<? extends VariableElement> parameters) {
//        Map<String, String> res = new HashMap<>();
//        for (VariableElement parameter : parameters) {
//            res.put(parameter.getSimpleName().toString(), parameter.asType().toString());
//        }
//        return res;
//    }

}

