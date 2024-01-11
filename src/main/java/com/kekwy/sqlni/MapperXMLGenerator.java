package com.kekwy.sqlni;

import com.kekwy.sqlni.annotation.MapperMethod;
import com.kekwy.sqlni.annotation.Param;
import com.kekwy.sqlni.mapper.BaseMapperProvider;
import com.kekwy.sqlni.query.SqlniQuery;
import com.kekwy.sqlni.util.ClassUtil;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/8 17:42
 */
public class MapperXMLGenerator {


    private BaseMapperProvider getMapperInstance(Class<? extends BaseMapperProvider> mapperClass) {
        try {
            return mapperClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(mapperClass.getName() + ": 没有默认构造方法");
        }
    }

    private java.lang.reflect.Method[] getMapperMethods(Class<? extends BaseMapperProvider> mapperClass) {
        List<java.lang.reflect.Method> res = new LinkedList<>();
        java.lang.reflect.Method[] methods = mapperClass.getDeclaredMethods();
        for (java.lang.reflect.Method method : methods) {
            if (method.getAnnotation(MapperMethod.class) != null) {
                res.add(method);
            }
        }
        return res.toArray(new java.lang.reflect.Method[0]);
    }

    private Object[] generateParams(java.lang.reflect.Method method) {
        List<Object> objects = new LinkedList<>();
        Parameter[] parameters = method.getParameters();
        for (Parameter parameter : parameters) {
            Param param = parameter.getAnnotation(Param.class);
            if (param != null) {
                try {
//                    objects.add(parameter.getType().getConstructor(String.class).newInstance(param.value()));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return objects.toArray(new Object[0]);
    }

    private void invokeMapperMethod(java.lang.reflect.Method method, BaseMapperProvider mapper, Object[] params) {
        try {
            method.invoke(mapper, params);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private Document createXMLDocument() {
        // 创建 XML 文档
        Document document = DocumentHelper.createDocument();

        // 添加 XML 版本和 DTD 声明
//        document.addProcessingInstruction("xml", "version=\"1.0\" encoding=\"UTF-8\"");
        document.addDocType("mapper", "-//mybatis.org//DTD Mapper 3.0//EN", "http://mybatis.org/dtd/mybatis-3-mapper.dtd");

        return document;
    }

    private void writeXMLFile(Document document, String targetPath) {
        // 设置生成 XML 的格式
        OutputFormat format = OutputFormat.createPrettyPrint();
        // 设置编码格式
        format.setEncoding("UTF-8");
        // 6、生成xml文件
        File file = new File(targetPath);
        XMLWriter writer = null;
        try {
            writer = new XMLWriter(Files.newOutputStream(file.toPath()), format);
//            // 设置是否转义，默认使用转义字符
//            writer.setEscapeText(false);
            writer.write(document);
            writer.close();
            System.out.println("生成rss.xml成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void buildMapper(Class<? extends BaseMapperProvider> mapperClass, String targetPath) {

        // 创建目标 XML 文件
        Document document = createXMLDocument();
        // 创建根元素
        Element root = document.addElement("mapper");

//        root.addAttribute()

        // 生成用户自定义的 Mapper 类的实例对象
        BaseMapperProvider mapper = getMapperInstance(mapperClass);
        // 获取用户定义的 Mapper 中的查询方法
        java.lang.reflect.Method[] methods = getMapperMethods(mapperClass);

        for (java.lang.reflect.Method method : methods) {
            // 创建新的 SqlniQuery 对象
            mapper.setSqlniQuery(new SqlniQuery(root));
            // 生成对应方法的参数
            Object[] params = generateParams(method);
            // 调用方法，根据用户在该方法中声明的查询方式完成对 SqlniQuery 对象的设置
            invokeMapperMethod(method, mapper, params);
        }

        // 生成文件，写入内容
        writeXMLFile(document, targetPath);

    }


    public void buildMappers(String packageName, String targetPath) {
        // 获取包名下所有类
        Set<Class<?>> classes = ClassUtil.getClassesByPackage(packageName);
        for (Class<?> c : classes) {
            if (BaseMapperProvider.class.isAssignableFrom(c)) {
                File dir = new File(targetPath + "/" + c.getPackage().getName().replace('.', '/'));
                if (!dir.mkdirs()) {
                    throw new RuntimeException("");
                }
                buildMapper(c.asSubclass(BaseMapperProvider.class),
                        targetPath + "/" + c.getName().replace('.', '/') + ".xml");
            }
            System.out.println(c.getName());
        }
    }

}
