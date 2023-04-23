package com.openallzzz;

import com.spring.OpenallzzzApplicationContext;

public class Test {

    public static void main(String[] args) {
        OpenallzzzApplicationContext context = new OpenallzzzApplicationContext(AppConfig.class);

        System.out.println(context.getBean("userService"));
        System.out.println(context.getBean("userService"));
        System.out.println(context.getBean("userService"));
    }

}
