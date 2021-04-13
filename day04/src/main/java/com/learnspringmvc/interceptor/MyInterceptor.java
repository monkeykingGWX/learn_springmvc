package com.learnspringmvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author monkeykingGWX
 * email 704835519@qq.com
 * created 2021-04-13 23:55
 */


public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 限流
        System.out.println("流量校验");
        System.out.println("……");
        System.out.println("……");
        System.out.println("……");
        System.out.println("校验通过");

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 注入系统信息
        modelAndView.addObject("tel", "400-322312");
        modelAndView.addObject("address", "安徽省合肥市岳西路与黄山路交口332号");
        modelAndView.addObject("icp", "皖ICP备19010773号-1. © 2018-2019");
    }

}
