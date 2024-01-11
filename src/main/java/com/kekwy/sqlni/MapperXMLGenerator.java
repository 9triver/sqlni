package com.kekwy.sqlni;

import com.kekwy.sqlni.annotation.MapperMethod;
import com.kekwy.sqlni.annotation.MapperProvider;
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
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static com.kekwy.sqlni.util.ClassUtil.getClassName;
import static com.kekwy.sqlni.util.ClassUtil.getPackageName;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/8 17:42
 */
public class MapperXMLGenerator {


    private Object getProviderInstance(Class<?> mapperClass) {
        try {
            return mapperClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private java.lang.reflect.Method[] getMapperMethods(Class<?> mapperClass) {
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

    private String invokeMapperMethod(Method method, Object mapper, Object[] params) {
        try {
            return (String) method.invoke(mapper, params);
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


    private void creatDirs(String dirPath) {
        File dir = new File(dirPath);
        boolean mkdirs = dir.mkdirs();
    }

    public void buildMapper(Class<?> mapperClass, String targetPath) {
        if (!mapperClass.isAnnotationPresent(MapperProvider.class)) return;
        String namespace = mapperClass.getAnnotation(MapperProvider.class).namespace();

        /* 设置文件路径及文件名 */
        String dirPath = targetPath + "/" + getPackageName(namespace).replace('.', '/') + '/';
        String filePath = dirPath + getClassName(namespace).replace('.', '/') + ".xml";
        creatDirs(dirPath);

        // 创建目标 XML 文件
        Document document = createXMLDocument();
        // 创建根元素
        Element root = document.addElement("mapper");
        root.addAttribute("namespace", namespace);

        // 生成用户自定义的 Mapper 类的实例对象
        Object mapper = getProviderInstance(mapperClass);
        // 获取用户定义的 Mapper 中的查询方法
        java.lang.reflect.Method[] methods = getMapperMethods(mapperClass);

        for (java.lang.reflect.Method method : methods) {
//            // 生成对应方法的参数
//            Object[] params = generateParams(method);
            String statement = invokeMapperMethod(method, mapper, null);
            /* 创建新的结点 */
            Element select = root.addElement("select");
            select.addAttribute("id", method.getName());
            select.addAttribute("resultType", "com.kekwy.mybatis.Employee");
            /* 将生成的中间查询语句转化为目标 XML 格式 */
            parseStatement(statement, select);
        }

        // 生成文件，写入内容
        writeXMLFile(document, filePath);

    }

    // TODO
    private void parseStatement(String statement, Element select) {

    }


    public void buildMappers(String packageName, String targetPath) {
        // 获取包名下所有类
        Set<Class<?>> classes = ClassUtil.getClassesByPackage(packageName);
        for (Class<?> c : classes) {
            if (c.isAnnotationPresent(MapperProvider.class))
                buildMapper(c, targetPath);
        }
    }

}
