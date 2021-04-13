package com.ssm.test;


import com.ssm.model.User;
import com.ssm.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Service {


    @Test
    public void t1 ()
    {
        ApplicationContext ac          = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService        userService = ac.getBean("userServiceImpl", UserService.class);
        userService.add(new User(null, "猴哥", "111111", 181223456521L));
        List<User> users = userService.list();
        users.forEach(System.out::println);
    }
}
