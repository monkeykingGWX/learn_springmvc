package com.ssm.service.impl;

import com.ssm.dao.UserDao;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public boolean add(User user) {
        return userDao.insert(user);
    }

    @Override
    public List<User> list() {
        return userDao.select();
    }
}
