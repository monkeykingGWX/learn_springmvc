package com.learnspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author monkeykingGWX
 * email 704835519@qq.com
 * created 2021-04-11 13:13
 */

@Controller
public class MyController {

    @RequestMapping("/some.do")
    public ModelAndView doSome ()
    {
        System.out.println("------doSome------");
        ModelAndView mv = new ModelAndView();

        mv.addObject("msg", "url:/some.do");
        mv.setViewName("show");
        return mv;
    }
}
