package com.kekwy.sqlni.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/8 17:49
 */
public class ClassUtil {

    public static String getPackageName(String className) {
        int index = className.lastIndexOf('.');
        return className.substring(0, index);
    }

    public static String getClassName(String className) {
        int index = className.lastIndexOf('.');
        return className.substring(index + 1);
    }

    public static Set<Class<?>> getClassesByPackage(String packageName) {
        Set<Class<?>> classSet = new HashSet<>();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.', '/');
        try {
            Enumeration<URL> resources = classLoader.getResources(path);
            while (resources.hasMoreElements()) {
                URL resource = resources.nextElement();
                classSet.addAll(getClassNameFromDirectory(resource.getPath(), packageName));
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return classSet;
    }

    private static Set<Class<?>> getClassNameFromDirectory(String path, String packageName) throws ClassNotFoundException {
        Set<Class<?>> classSet = new HashSet<>();
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        classSet.addAll(getClassNameFromDirectory(file.getAbsolutePath(), packageName + "." + file.getName()));
                    } else if (file.getName().endsWith(".class")) {
                        String className = packageName + '.' + file.getName().substring(0, file.getName().length() - 6);
                        classSet.add(Class.forName(className));
                    }
                }
            }
        }
        return classSet;
    }

}
