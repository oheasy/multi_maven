package com.hxy.response;

/**
 * Created by hxy-pc on 2016/9/21.
 */
public class UserResponse {
    private String ret = "0";
    private String name;
    private Integer age;

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
