package com.learnboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author monkeykingGWX
 * email 704835519@qq.com
 * created 2021-04-18 11:34
 */


//@Controller
//@ResponseBody

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index ()
    {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello, Spring Boot 2!";
    }
}
