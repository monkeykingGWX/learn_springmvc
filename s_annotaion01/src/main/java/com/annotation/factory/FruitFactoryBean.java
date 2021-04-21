package com.annotation.factory;

import com.annotation.bean.Fruit;
import org.springframework.beans.factory.FactoryBean;

public class FruitFactoryBean implements FactoryBean {
    private String name;

    public Object getObject() throws Exception {
        System.out.println("create fruit");
        return new Fruit(name);
    }

    public Class<?> getObjectType() {
        return Fruit.class;
    }

    public boolean isSingleton() {
        return true;
    }

    public void setName(String name) {
        this.name = name;
    }

}
