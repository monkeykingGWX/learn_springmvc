package com.ssm.dao;

import com.ssm.model.User;
import java.util.List;

public interface UserDao {

    boolean insert (User user);

    List<User> select ();
}
