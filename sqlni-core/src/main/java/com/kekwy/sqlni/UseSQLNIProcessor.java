package com.kekwy.sqlni;

import com.google.auto.service.AutoService;
import com.kekwy.sqlni.util.XMLUtil;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * UseSQLNI 注解对应的处理器，在项目编译时执行，
 * 为用户在编译输出目录下对应的软件包中生成可被 Mybatis 直接使用的 XML 文件
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/11 17:03
 */
@AutoService(Processor.class) // 自动注册自定义的注解处理器
@SupportedAnnotationTypes({"com.kekwy.sqlni.UseSQLNI"}) // BUGFIX: 更改注解名未同步此处名称
@SupportedSourceVersion(SourceVersion.RELEASE_17)
public class UseSQLNIProcessor extends AbstractProcessor {

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

    private String getFilePath(String packageName, String mapperName) throws IOException {
        Filer filer = processingEnv.getFiler();
        FileObject fileObject = filer.createResource(
                StandardLocation.CLASS_OUTPUT, packageName, mapperName + ".xml"
        );
        return fileObject.getName();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "sdfsdf");
        // 注解处理结束
        if (roundEnv.processingOver()) {
            try {
                // 遍历上下文中所有的 mapperBuilder，生成用户定义的 mapper 所对应的 XML 文件
                for (MapperBuilder builder : builderMap.values()) {
                    Mapper mapper = builder.build();
                    String filePath = getFilePath(mapper.packageName(), mapper.mapperName());
                    XMLUtil.writeXMLFile(mapper.root(), filePath);
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
                    builder = new MapperBuilder(className);
                    builderMap.put(className, builder);
                } else {
                    builder = builderMap.get(className);
                }
                String resultType = methodElement.getReturnType().toString();
                // 添加方法并设置 resultType 和 statement
                // TODO: 处理 resultMap 的情况
                builder.addMethod(methodName).resultType(resultType).statement(statement);
            }
        }
        return true;
    }

}

