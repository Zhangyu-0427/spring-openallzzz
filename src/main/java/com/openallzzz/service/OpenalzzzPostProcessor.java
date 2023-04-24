package com.openallzzz.service;

import com.spring.BeanPostProcessor;
import com.spring.Component;
import com.spring.Scope;

@Component
public class OpenalzzzPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("初始化前");
        if (beanName.equals("userService")) { // 方式一：对特定的bean进行处理
            ((UserService)bean).setName("zy");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("初始化后");
        return bean;
    }
}
