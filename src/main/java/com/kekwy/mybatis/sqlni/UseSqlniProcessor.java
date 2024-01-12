package com.kekwy.mybatis.sqlni;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Collections;
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


    /* 暂时采用正则表达式处理，且仅支持 concat 函数，默认方言上下文为 MySQL */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
//      processing logic here
        for (Element element : roundEnv.getElementsAnnotatedWith(UseSqlni.class)) {

            if (element.getKind() == ElementKind.METHOD && element instanceof ExecutableElement methodElement) {
                UseSqlni useSqlniAnnotation = methodElement.getAnnotation(UseSqlni.class);
                // 获取 Sqlni 语句
                String statement = useSqlniAnnotation.value();

                // Just for test
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, statement);

                // 删除语句中的 \n, \r 等字符，未来将改为使用 AST 实现
                

                // 生成 MyBatis XML 文件
//                generateMyBatisXmlFile(methodElement, sqlStatement);
            }
        }
        return true;

    }


}
