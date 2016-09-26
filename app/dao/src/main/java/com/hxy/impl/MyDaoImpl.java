package com.hxy.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hxy.MyDao;
import com.hxy.User;

/**
 * Created by houxiaoyu01 on 2016/8/24.
 */
@Repository
public class MyDaoImpl implements MyDao {
    @Override
    public List<User> queryAllUsers() {
        List<User> users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(23);
        u1.setName("hh");

        User u2 = new User();
        u2.setAge(21);
        u2.setName("xxx");

        users.add(u1);
        users.add(u2);
        return users;
    }

    @Override
    public User queryUserByName(String name) {
        return new User("yyy", 25);
    }
}
