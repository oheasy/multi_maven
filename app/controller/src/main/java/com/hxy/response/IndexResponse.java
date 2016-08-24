/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.hxy.response;

import org.codehaus.jackson.annotate.JsonProperty;

import com.hxy.model.UsersInfo;

import lombok.Data;

/**
 * Created by houxiaoyu01 on 2016/8/24.
 */
@Data
public class IndexResponse {
    @JsonProperty("ret")
    private String ret;

    @JsonProperty("ret_code")
    private String retCode;

    @JsonProperty("user_info")
    private UsersInfo userInfo;

    public IndexResponse() {
        ret = "ok";
        retCode = "0";
    }
}
