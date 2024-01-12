package com.kekwy.mybatis.sqlni;

import com.google.auto.service.AutoService;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/11 17:03
 */

@AutoService(Processor.class) // 自动注册自定义的注解处理器
@SupportedAnnotationTypes({"com.kekwy.mybatis.sqlni.UseSqlni"})
@SupportedSourceVersion(SourceVersion.RELEASE_17)
public class UseSqlniProcessor extends AbstractProcessor {


    private final Map<String, MapperBuilder> builderMap = new HashMap<>();

    private void createXMLFile(Mapper mapper) {
        // TODO: 用 XML 工具类封装操作
        // 设置生成 XML 的格式
        OutputFormat format = OutputFormat.createPrettyPrint();
        // 设置编码格式
        format.setEncoding("UTF-8");
        try {
            Filer filer = processingEnv.getFiler();
            FileObject fileObject = filer.createResource(
                    StandardLocation.CLASS_OUTPUT,
                    mapper.packageName(),
                    mapper.mapperName() + ".xml");
            Writer writer = fileObject.openWriter();
            XMLWriter xmlWriter = new XMLWriter(writer, format);
            xmlWriter.write(mapper.document());
            // TODO: 记录关于 close() 的相关问题
            xmlWriter.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                    "Error generating MyBatis XML file: " + e.getMessage());
        }
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
//      processing logic here

        // 注解处理结束
        if (roundEnv.processingOver()) {
            Filer filer = processingEnv.getFiler();     // 获取项目的Resources目录路径
            // 遍历上下文中所有的 mapperBuilder，生成用户定义的 mapper 所对应的 XML 文件
            for (MapperBuilder builder : builderMap.values()) {
                createXMLFile(builder.build());
            }
            return false;
        }
        // 处理注解
        for (Element element : roundEnv.getElementsAnnotatedWith(UseSqlni.class)) {

            if (element.getKind() == ElementKind.METHOD && element instanceof ExecutableElement methodElement) {
                UseSqlni useSqlniAnnotation = methodElement.getAnnotation(UseSqlni.class);
                // 获取 Sqlni 语句
                String statement = useSqlniAnnotation.value();

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
                builder.addMethodWithType(methodName, resultType, statement);
            }
        }
        return true;
    }

}

