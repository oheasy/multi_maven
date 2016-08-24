/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.hxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hxy.MyService;
import com.hxy.model.UsersInfo;
import com.hxy.response.IndexResponse;

/**
 * Created by houxiaoyu01 on 2016/8/24.
 */
@Controller
public class MyContoller {
    @Autowired
    private MyService myService;

    @RequestMapping(value = "/index", produces = "application/json")
    @ResponseBody
    public IndexResponse index() {
        UsersInfo usersInfo = myService.findAllUsers();
        IndexResponse response = new IndexResponse();
        response.setUserInfo(usersInfo);

        return response;
    }
}
