package com.annotation.config;

import com.annotation.bean.Car;
import com.annotation.bean.User;
import com.third.controller.OrderController;
import com.third.service.OrderService;
import org.springframework.context.annotation.*;

/**
 * @author monkeykingGWX
 * email 704835519@qq.com
 * created 2021-04-18 16:46
 */


@Configuration
@ComponentScan(value = "com.annotation")
@Import(value = {OrderController.class, OrderService.class, MyImportSelector.class})
@PropertySource("classpath:person.properties")
public class SpringConfig {

   // @Scope(value = "prototype")
    @Bean(value = "user")
    @Lazy()
    public User getUser ()
    {
        System.out.println("new user");
        return new User(30, "gwx");
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Car car ()
    {
        return new Car();
    }
}
