package com.annotation.test;

import com.annotation.bean.User;
import com.annotation.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author monkeykingGWX
 * email 704835519@qq.com
 * created 2021-04-18 16:57
 */


public class T1 {

    @Test
    public void t1 ()
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        User user = context.getBean("user", User.class);
//        System.out.println(user);

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        User                           user    = context.getBean("user", User.class);
//        System.out.println(user);
    }

    @Test
    public void t2 ()
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[]                           names = context.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }
    }
}
