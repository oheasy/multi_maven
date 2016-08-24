/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.hxy.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxy.MyDao;
import com.hxy.MyService;
import com.hxy.User;
import com.hxy.model.UsersInfo;

/**
 * Created by houxiaoyu01 on 2016/8/24.
 */
@Service
public class MyServiceImpl implements MyService {
    @Autowired
    private MyDao myDao;
    @Override
    public UsersInfo findAllUsers() {
        List<User> users = myDao.queryAllUsers();
        UsersInfo usersInfo = new UsersInfo();
        usersInfo.setUserList(users);

        return usersInfo;
    }

    @Override
    public User findUserByName() {
        return myDao.queryUserByName("good");
    }
}
