package com.kekwy.sqlni;

import com.github.drinkjava2.jdialects.Dialect;
import com.kekwy.sqlni.generator.MapperGenerator;
import com.kekwy.sqlni.generator.MapperXMLGenerator;
import com.kekwy.sqlni.generator.ServiceGenerator;
import com.kekwy.sqlni.generator.ServiceImplGenerator;
import com.kekwy.sqlni.templates.SQLTemplates;
import com.kekwy.sqlni.util.SQLDialectUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
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
 * 处理 @Mapper 注解的注解处理器，在项目编译时执行，
 * 根据用户定义的查询生成对应的 XML 文件，Mapper 接口，Service 接口
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/11 17:03
 */
@SupportedAnnotationTypes({"org.apache.ibatis.annotations.Mapper"})
@SupportedSourceVersion(SourceVersion.RELEASE_17)
public class Processor extends AbstractProcessor {

    private Dialect dialect;

    private final Map<String, Template> freeMarkerTemplates = new HashMap<>();

    /**
     * 从 pom.xml 文件中读取有关 SQL 模板的配置信息
     *
     * @param processingEnv environment to access facilities the tool framework
     *                      provides to the processor
     */
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        initSQLDialect();
        initFreeMarker();
    }

    private void initSQLDialect() {
        String sqlDialect = processingEnv.getOptions().get("SQLDialect");
        dialect = SQLDialectUtil.getDialect(sqlDialect);
    }

    private void initFreeMarker() {
        Configuration config = new Configuration(Configuration.VERSION_2_3_32);
        config.setClassForTemplateLoading(Processor.class, "/templates");
        try {
            freeMarkerTemplates.put("mapper", config.getTemplate("Mapper.ftl"));
            freeMarkerTemplates.put("service", config.getTemplate("Service.ftl"));
            freeMarkerTemplates.put("serviceImpl", config.getTemplate("ServiceImpl.ftl"));
            freeMarkerTemplates.put("mapperXML", config.getTemplate("MapperXML.ftl"));
        } catch (IOException e) {
            handleException(e);
        }
    }

    private void handleException(Exception e) {
        StringBuilder builder = new StringBuilder();
        builder.append(e.getMessage()).append("\n");
        for (StackTraceElement element : e.getStackTrace()) {
            builder.append(element.toString()).append("\n");
        }
        processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, builder.toString());
    }

    private String getEntityName(TypeElement mapper) {
        // 获取 BaseMapper 接口的 TypeElement
        TypeElement baseMapperType = processingEnv.getElementUtils().getTypeElement("com.baomidou.mybatisplus.core.mapper.BaseMapper");
        // 获取 Mapper 接口的直接父类的泛型信息
        for (TypeMirror interfaceType : mapper.getInterfaces()) {
            DeclaredType declaredType = (DeclaredType) interfaceType;
            TypeElement interfaceElement = (TypeElement) declaredType.asElement();

            if (interfaceElement.equals(baseMapperType)) {
                TypeMirror tempTypeMirror = declaredType.getTypeArguments().get(0);
                TypeElement tempTypeElement = (TypeElement) ((DeclaredType) tempTypeMirror).asElement();

                return tempTypeElement.getQualifiedName().toString();
            }
        }
        return null;
    }

    private void generateMapper(TypeElement mapper, String entityName) {
        Map<String, Object> mapperModel = new MapperGenerator(processingEnv, mapper, entityName).generate();
        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, mapperModel.toString());
        try {
            String packageName = (String) mapperModel.get("package");
            String className = (String) mapperModel.get("mapperName");
            FileObject fileObject = processingEnv.getFiler().createResource(
                    StandardLocation.SOURCE_OUTPUT, "java." + packageName, className + ".java"
            );
            Template template = freeMarkerTemplates.get("mapper");
            Writer writer = fileObject.openWriter();
            template.process(mapperModel, writer);
            writer.flush();
            writer.close(); // 需要手动 flush 以及 close，否则可能导致无法输出
        } catch (IOException | TemplateException e) {
            handleException(e);
        }
    }

    private void generateService(TypeElement mapper, String entityName) {
        Map<String, Object> serviceModel = new ServiceGenerator(processingEnv, mapper, entityName).generate();
        try {
            String packageName = (String) serviceModel.get("package");
            String className = (String) serviceModel.get("serviceName");
            FileObject fileObject = processingEnv.getFiler().createResource(
                    StandardLocation.SOURCE_OUTPUT, "java." + packageName, className + ".java"
            );
            Template template = freeMarkerTemplates.get("service");
            Writer writer = fileObject.openWriter();
            template.process(serviceModel, writer);
            writer.flush();
            writer.close();
        } catch (IOException | TemplateException e) {
            handleException(e);
        }
    }

    private void generateServiceImpl(TypeElement mapper, String entityName) {
        Map<String, Object> serviceImplModel = new ServiceImplGenerator(processingEnv, mapper, entityName).generate();
        try {
            String packageName = (String) serviceImplModel.get("package");
            String className = (String) serviceImplModel.get("serviceImplName");
            FileObject fileObject = processingEnv.getFiler().createResource(
                    StandardLocation.SOURCE_OUTPUT, "java." + packageName, className + ".java"
            );
            Template template = freeMarkerTemplates.get("serviceImpl");
            Writer writer = fileObject.openWriter();
            template.process(serviceImplModel, writer);
            writer.flush();
            writer.close();
        } catch (IOException | TemplateException e) {
            handleException(e);
        }
    }

    private void generateMapperXML(TypeElement mapper, String entityName) {
        Map<String, Object> mapperXMLModel =
                new MapperXMLGenerator(processingEnv, mapper, entityName, dialect).generate();
        try {
            String packageName = (String) mapperXMLModel.get("package");
            String fileName = mapperXMLModel.get("mapperName") + ".xml";
            FileObject fileObject = processingEnv.getFiler().createResource(
                    StandardLocation.SOURCE_OUTPUT, "recourses." + packageName, fileName
            );
            Template template = freeMarkerTemplates.get("mapperXML");
            Writer writer = fileObject.openWriter();
            template.process(mapperXMLModel, writer);
            writer.flush();
            writer.close();
        } catch (IOException | TemplateException e) {
            handleException(e);
        }
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(Mapper.class)) {
            if (element instanceof TypeElement mapper) {
                String entityName = getEntityName(mapper);
                generateMapper(mapper, entityName);
                generateService(mapper, entityName);
                generateServiceImpl(mapper, entityName);
                generateMapperXML(mapper, entityName); // core
            }
        }
        return true;
    }

}

