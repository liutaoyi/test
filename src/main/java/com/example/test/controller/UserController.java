package com.example.test.controller;

import com.example.test.dto.MyDTO;
import com.example.test.entity.User;
import com.example.test.service.UserService;
import com.example.test.utils.Result;
import com.example.test.utils.ResultUtil;
import io.jsonwebtoken.lang.Assert;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/insert")
    @ApiOperation(value = "添加用户")
    public Result<Object> insert(@RequestParam User user){
        userService.insert(user);
        return ResultUtil.success();
    }

    @PostMapping(value = "/query")
    @ApiOperation(value = "查询所有用户")
    public Result<Object> query(){
       return ResultUtil.success(userService.query());
    }

//    @PostMapping(value = "/getLoginInitial")
//    @ApiOperation(value = "获取相应的信息")
//    public Result<Object> getResponse(){
//        return ResultUtil.success(userService.loginForApp());
//    }
//
    @CrossOrigin(origins = "*")
    @PostMapping(value = "/login")
    @ApiOperation(value = "用户登录")
    public Result<Object> login(@ApiParam(value = "用户名") @RequestParam String username,
                                @ApiParam(value = "密码") @RequestParam String password){
        return ResultUtil.success(userService.login(username,password));
    }

    @PostMapping(value = "/queryPage")
    @ApiOperation(value = "查询所有用户--分页")
    public Result<Object> queryPage(@ApiParam(value = "页数",defaultValue = "1")@RequestParam Integer page,
                                    @ApiParam(value = "每页条数",defaultValue = "5")@RequestParam Integer size){
        return ResultUtil.success(userService.queryAll(page,size));
    }

    @PostMapping(value = "test")
    public Result test(@RequestBody MyDTO myDTO){
        if (userService.test(myDTO) == 1){
            return ResultUtil.success();
        }else {
            return ResultUtil.error("失败");
        }
    }

    @DeleteMapping
    public Result delete(){
        userService.delete();
        return ResultUtil.success();
    }

    @GetMapping(value = "abc")
    public Result getData(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam Date time){

        return ResultUtil.success(userService.getByCondition(time));
    }
}
