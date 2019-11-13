package com.example.test.controller;

import com.example.test.entity.Xiaohu;
import com.example.test.service.UserService;
import com.example.test.utils.Result;
import com.example.test.utils.ResultUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping(value = "add")
    public Result test(@RequestBody Xiaohu test) {
        userService.add(test);
        return ResultUtil.success();
    }

    @DeleteMapping(value = "delete")
    public Result delete() {
        userService.delete();
        return ResultUtil.success();
    }
}
