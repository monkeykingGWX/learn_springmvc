package com.learnspringmvc.exception;

/**
 * @author monkeykingGWX
 * email 704835519@qq.com
 * created 2021-04-13 21:54
 */


public class UserException extends Exception {
    public UserException() {
        super();
    }

    public UserException(String message) {
        super(message);
    }
}
