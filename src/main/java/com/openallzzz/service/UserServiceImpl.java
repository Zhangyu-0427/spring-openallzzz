package com.openallzzz.service;

import com.spring.*;

@Component("userService")
@Scope("prototype")
public class UserServiceImpl implements UserService, InitializingBean, BeanNameAware{

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

    @Override
    public void afterPropertiesSet() throws Exception {
        setName("小小的bean~");
        System.out.println("哎呦你干嘛~");
    }

    @Override
    public void setBeanName(String name) {
        Component component = this.getClass().getAnnotation(Component.class);
        this.beanName = component.value();
    }
}
