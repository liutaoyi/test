package com.example.test.dto;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-08-21 21:42
 * @description:
 **/

public class LoginDto {

    private Integer userId;

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
