package com.openallzzz;

import com.openallzzz.service.UserService;
import com.spring.OpenallzzzApplicationContext;

public class Test {

    public static void main(String[] args) {
        OpenallzzzApplicationContext context = new OpenallzzzApplicationContext(AppConfig.class);

        UserService userService = (UserService) context.getBean("userService");
        userService.test();
    }

}
