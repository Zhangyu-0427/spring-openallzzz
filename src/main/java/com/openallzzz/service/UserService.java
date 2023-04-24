package com.openallzzz.service;

import com.spring.*;

@Component("userService")
@Scope("prototype")
public class UserService implements BeanNameAware, InitializingBean {

    @Autowired
    private OrderService orderService;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void test() {
        System.out.println(orderService);
        System.out.println(beanName);
        System.out.println(name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("UserService is initializing...");
    }
}
