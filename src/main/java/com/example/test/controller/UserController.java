package com.example.test.controller;

import com.example.test.dto.LoginDto;
import com.example.test.entity.User;
import com.example.test.service.UserServiceImpl;
import com.example.test.utils.Result;
import com.example.test.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-08-21 20:50
 * @description:
 **/
@RestController
@Api(tags = "用户模块")
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @PostMapping(value = "/insert")
    @ApiOperation(value = "添加用户")
    public Result<Object> insert(User user){
        userService.insert(user);
        return ResultUtil.success();
    }

    @PostMapping(value = "/query")
    @ApiOperation(value = "查询所有用户")
    public Result<Object> query(){
       return ResultUtil.success(userService.query());
    }

    @PostMapping(value = "/getLoginInitial")
    @ApiOperation(value = "获取相应的信息")
    public Result<Object> getResponse(){
        return ResultUtil.success(userService.loginForApp());
    }

    @PostMapping(value = "/login")
    @ApiOperation(value = "用户登录")
    public Result<Object> login(@ApiParam(value = "用户名") @RequestParam String username,
                                @ApiParam(value = "密码") @RequestParam String password){
        return ResultUtil.success(userService.login(username,password));
    }
}
