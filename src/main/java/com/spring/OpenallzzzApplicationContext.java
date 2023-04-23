package com.spring;

public class OpenallzzzApplicationContext { // 容器类

    private final Class<?> configClass;

    public OpenallzzzApplicationContext(Class<?> configClass) {
        this.configClass = configClass;

        // 解析配置类
        // ComponentScan注解 --> 扫描路径 -- > 扫描
    }

    public Object getBean(String beanName) {
        return null;
    }

}