package com.spring;

import com.sun.javaws.jnl.LibraryDesc;

import java.io.File;
import java.net.URL;

public class OpenallzzzApplicationContext { // 容器类

    private final Class<?> configClass;

    public OpenallzzzApplicationContext(Class<?> configClass) {
        this.configClass = configClass;

        // 解析配置类
        // ComponentScan注解 --> 扫描路径 -- > 扫描

        ComponentScan componentScanAnnotation = configClass.getDeclaredAnnotation(ComponentScan.class);
        String path = componentScanAnnotation.value(); // 获取注解上的类路径

        path = path.replace('.', '/'); // 替换成文件分割符

        // 扫描
        /*类加载器
            Bootstrap-->jre/lib
            Ext-->jre/ext/lib
            App-->classpath
        */

        // 获取类加载器
        ClassLoader classLoader = OpenallzzzApplicationContext.class.getClassLoader();
        URL resource = classLoader.getResource(path);
        File file = new File(resource.getFile());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                String fileName = f.getAbsolutePath();
                if(fileName.endsWith(".class")) { // 判断是否是类文件
                    String className = fileName.substring(fileName.indexOf("com"), fileName.indexOf(".class"));
                    className = className.replace('\\', '.');
                    Class<?> aClass = null;
                    try {
                        aClass = classLoader.loadClass(className);
                        if (aClass.isAnnotationPresent(Component.class)) { // 当前类是一个Bean

                        }
                    } catch (ClassNotFoundException e) {
                        e.getStackTrace();
                    }
                }
            }
        }
    }

    public Object getBean(String beanName) {
        return null;
    }

}