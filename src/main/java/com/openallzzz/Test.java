package com.openallzzz;

import com.spring.OpenallzzzApplicationContext;

public class Test {

    public static void main(String[] args) {
        OpenallzzzApplicationContext context = new OpenallzzzApplicationContext(AppConfig.class);

        Object userService = context.getBean("userService");
    }

}
