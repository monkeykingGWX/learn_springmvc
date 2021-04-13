package com.learnspringmvc.controller;

import com.learnspringmvc.exception.OrderException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author monkeykingGWX
 * email 704835519@qq.com
 * created 2021-04-13 22:13
 */


@RequestMapping("/order")
@Controller
public class OrderController {

    @RequestMapping("/ordernum")
    public ModelAndView orderNum (@RequestParam("order_num") Long orderNum) throws OrderException {
        if (orderNum < 1000000000L || orderNum > 9999999999L) {
            throw new OrderException("order_num must between 1000000000 and 9999999999");
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "orderNum:" + orderNum);
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
