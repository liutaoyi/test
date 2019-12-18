package com.example.test.controller;

import com.example.test.entity.Xiaohu;
import com.example.test.service.UserService;
import com.example.test.utils.Result;
import com.example.test.utils.ResultUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-08-21 20:50
 * @description:
 **/
@RestController
@Api(tags = "测试模块")
@RequestMapping(value = "/fuck")
public class TestController {

    @Autowired
    UserService userService;

    @PostMapping(value = "test")
    public Result test(@RequestBody Xiaohu xiaohu) {
        return ResultUtil.success(userService.test15(xiaohu));
    }


}
