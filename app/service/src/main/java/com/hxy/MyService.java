package com.hxy;

import java.util.List;

import com.hxy.model.UsersInfo;

/**
 * Created by houxiaoyu01 on 2016/8/24.
 */
public interface MyService {
    UsersInfo findAllUsers();

    User findUserByName();
}
