package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author monkeykingGWX
 * email 704835519@qq.com
 * created 2021-04-11 13:13
 */

@Controller
public class MyController {

    @Resource
    private UserService userService;

    @RequestMapping("/some.do")
    public ModelAndView doSome ()
    {
        List<User> list = userService.list();
        list.forEach(System.out::println);
        System.out.println("------doSome------");
        ModelAndView mv = new ModelAndView();

        mv.addObject("msg", "gwx");
        mv.setViewName("show");
        return mv;
    }
}
