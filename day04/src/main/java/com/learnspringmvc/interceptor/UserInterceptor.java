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


public class UserInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 登录校验
        System.out.println("登录校验");
        System.out.println("……");
        System.out.println("……");
        System.out.println("……");
        System.out.println("校验不通过");

        return false;
    }

}
