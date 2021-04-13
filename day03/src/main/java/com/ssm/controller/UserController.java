package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/reg.do")
    public ModelAndView reg (User user)
    {
        ModelAndView view = new ModelAndView();

        String msg = "注册失败";
        if (userService.add(user)) {
            msg  = "注册成功";
        }

        view.addObject("msg", msg);
        view.setViewName("show");

        return view;
    }

}
