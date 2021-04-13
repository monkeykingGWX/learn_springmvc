package com.ssm.model;

public class User {
    private Integer userId;
    private String username;
    private String pass;
    private Long mobile;

    public User() {
    }

    public User(Integer userId, String username, String pass, Long mobile) {
        this.userId = userId;
        this.username = username;
        this.pass = pass;
        this.mobile = mobile;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }
}
