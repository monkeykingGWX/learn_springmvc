package com.ssm.service;


import com.ssm.model.User;

import java.util.List;

public interface UserService {

    boolean add (User user);

    List<User> list ();
}
