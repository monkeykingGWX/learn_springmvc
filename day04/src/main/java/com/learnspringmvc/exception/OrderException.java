package com.learnspringmvc.exception;

/**
 * @author monkeykingGWX
 * email 704835519@qq.com
 * created 2021-04-13 22:04
 */


public class OrderException extends Exception {
    public OrderException() {
        super();
    }

    public OrderException(String message) {
        super(message);
    }
}
