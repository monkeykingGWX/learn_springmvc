package com.learnspringmvc.controller;

import com.learnspringmvc.exception.UserException;
import com.learnspringmvc.model.Country;
import com.learnspringmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RequestMapping("/user")
@Controller
public class UserController {

    @RequestMapping("/login")
    public ModelAndView login(User user) throws UserException {
        ModelAndView modelView = new ModelAndView();

        if (user.getName().length() > 4) {
            throw new UserException("name length must less 4");
        }

        if (user.getAge() > 100) {
            throw new UserException("illegal age");
        }

        modelView.addObject("msg", "username:" + user.getName() + ",age:" + user.getAge());

        modelView.setViewName("show");
        return modelView;
    }

    @RequestMapping(value = "/index.do", method = RequestMethod.GET)
    public ModelAndView index ()
    {
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("msg", "/user/index.do");

        // 隐式转发
        //modelView.setViewName("show");

        // 显示转发
        modelView.setViewName("forward:/WEB-INF/jsp/show.jsp");

        return modelView;
    }

    @RequestMapping("redirect.do")
    public ModelAndView redirect ()
    {
        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("redirect:/index.jsp");

        return modelView;
    }

    @RequestMapping("m1.do")
    public ModelAndView m1 (HttpServletRequest req, HttpServletResponse res, HttpSession session)
    {
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("msg", req.getParameter("msg"));
        modelView.setViewName("show");

        return modelView;
    }

    @RequestMapping("m2.do")
    public ModelAndView m2 (String name, Integer age)
    {
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("msg", "name:" + name + ", age:" + age);
        modelView.setViewName("show");

        return modelView;
    }

    @RequestMapping("m3.do")
    public ModelAndView m3 (@RequestParam(value="name", required = false) String n, @RequestParam(value = "age", required = false) Integer a)
    {
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("msg", "name:" + n + ", age:" + a);
        modelView.setViewName("show");

        return modelView;
    }

    @RequestMapping("m4.do")
    public ModelAndView m4 (User user)
    {
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("msg", "name:" + user.getName() + ", age:" + user.getAge());
        modelView.setViewName("show");

        return modelView;
    }

    @RequestMapping("m5.do")
    public ModelAndView m5 (User user, Country country)
    {
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("msg", "name:" + user.getName() + ", age:" + user.getAge() + ", country" + country.getCountryName());
        modelView.setViewName("show");

        return modelView;
    }

    @RequestMapping("m6.do")
    public ModelAndView m6 (User user, String countryName)
    {
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("msg", "name:" + user.getName() + ", age:" + user.getAge() + ", country" + countryName);
        modelView.setViewName("show");

        return modelView;
    }

    @RequestMapping("m7.do")
    public String m7 (HttpServletRequest req, User user)
    {
        req.setAttribute("msg", "name:"+user.getName()+",age:"+user.getAge());

        return "show";
    }

    @RequestMapping("m8.do")
    @ResponseBody
    public List<User> m8 ()
    {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("James", 36));
        users.add(new User("Harden", 31));

        return users;
    }
}
