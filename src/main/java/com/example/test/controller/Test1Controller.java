package com.example.test.controller;

import com.example.test.service.UserService;
import com.example.test.utils.Result;
import com.example.test.utils.ResultUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-11-22 10:08
 * @description:
 **/
@RestController
@Api(tags = "测试1")
@RequestMapping(value = "/cao")
public class Test1Controller {

    @Autowired
    UserService userService;


    @GetMapping(value = "test")
    public Result test() {
        return ResultUtil.success(userService.getStuInfo());
    }
}
