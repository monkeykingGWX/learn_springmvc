package com.learnspringmvc.handler;

import com.learnspringmvc.exception.OrderException;
import com.learnspringmvc.exception.UserException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author monkeykingGWX
 * email 704835519@qq.com
 * created 2021-04-13 22:20
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = UserException.class)
    public ModelAndView userException (Exception ex)
    {
        ModelAndView view = new ModelAndView();
        view.addObject("ex", ex);
        view.addObject("msg", "用户模块错误");
        view.setViewName("error");

        return view;
    }

    @ExceptionHandler(value = OrderException.class)
    public ModelAndView orderException (Exception ex)
    {
        ModelAndView view = new ModelAndView();
        view.addObject("ex", ex);
        view.addObject("msg", "订单模块错误");
        view.setViewName("error");

        return view;
    }

    // 处理其他未定义的异常
    @ExceptionHandler
    public ModelAndView otherExcetion (Exception ex)
    {
        ModelAndView view = new ModelAndView();
        view.addObject("ex", ex);
        view.addObject("msg", "其他未知模块异常");
        view.setViewName("error");

        return view;
    }
}
