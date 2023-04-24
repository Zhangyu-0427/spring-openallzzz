package com.openallzzz.service;

import com.spring.*;

@Component("userService")
@Scope("prototype")
public class UserServiceImpl implements UserService {

    @Autowired
    private OrderService orderService;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private String beanName;

    public void test() {
        System.out.println(orderService);
        System.out.println(beanName);
        System.out.println(name);
    }

}
