package com.example.test.controller;

import com.example.test.service.UserService;
import com.example.test.utils.Result;
import com.example.test.utils.ResultUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

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
    UserService userService;

    @GetMapping(value = "abc")
    public Result getData(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam Date time){

        return ResultUtil.success(userService.getByCondition(time));
    }
}
