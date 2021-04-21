package com.annotation.test;

import com.annotation.bean.Car;
import com.annotation.bean.Fruit;
import com.annotation.bean.Person;
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
    public void t1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        User user = context.getBean("user", User.class);
//        System.out.println(user);

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        User                           user    = context.getBean("user", User.class);
//        System.out.println(user);
    }

    @Test
    public void t2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[]                           names   = context.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void t3() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Object                         banana             = applicationContext.getBean("&banana");
        Object                         apple              = applicationContext.getBean("apple");

        System.out.println(banana.getClass()); // class com.annotation.factory.FruitFactoryBean
        System.out.println(apple.getClass());  // class com.annotation.bean.Fruit
    }

    @Test
    public void t4() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        Object apple  = applicationContext.getBean("apple");
//        Object apple2  = applicationContext.getBean("apple");
//
//        System.out.println(apple.getClass());  // class com.annotation.bean.Fruit
//        System.out.println(apple == apple2);
    }

    @Test
    public void t5() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        context.getBean("car", Car.class);
        context.close();
    }

    @Test
    public void t6() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Person person = context.getBean("person", Person.class);
        System.out.println(person);  // Person{name='James', age=36}
    }
}