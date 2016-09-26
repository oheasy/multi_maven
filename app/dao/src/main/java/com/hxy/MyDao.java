package com.hxy;

import java.util.List;

/**
 * Created by houxiaoyu01 on 2016/8/24.
 */
public interface MyDao {
    List<User> queryAllUsers();

    User queryUserByName(String name);
}
