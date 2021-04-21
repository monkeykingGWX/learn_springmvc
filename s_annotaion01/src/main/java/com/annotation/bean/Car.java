package com.annotation.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean,DisposableBean
{
    public Car() {
        System.out.println("create a car");
    }

    public void initMethod ()
    {
        System.out.println("car init");
    }

    public void destroyMethod ()
    {
        System.out.println("car destroy");
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");
    }
}
