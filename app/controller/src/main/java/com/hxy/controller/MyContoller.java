/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.hxy.controller;

import com.hxy.response.StuResponse;
import com.hxy.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hxy.MyService;
import com.hxy.model.UsersInfo;
import com.hxy.response.IndexResponse;

import javax.annotation.Resource;

/**
 * Created by houxiaoyu01 on 2016/8/24.
 */

@Controller
public class MyContoller {
    @Autowired
    private MyService myService;

    @Autowired
    private UserResponse userResponse;

    @Autowired
    private StuResponse stuResponse;

    @RequestMapping(value = "/index")
    @ResponseBody
    public IndexResponse index() {
        UsersInfo usersInfo = myService.findAllUsers();
        IndexResponse response = new IndexResponse();
        response.setUserInfo(usersInfo);
        test();
        return response;
    }

    @RequestMapping(value = "/userResponse")
    @ResponseBody
    public UserResponse getUserResponse() {
        return userResponse;
    }

    @RequestMapping(value = "/stuResponse")
    @ResponseBody
    public StuResponse getStuResponse() {
        return stuResponse;
    }

    @RequestMapping(value = "/forward")
    private String test() {
        return "redirect:https://www.baidu.com/";
    }


}
