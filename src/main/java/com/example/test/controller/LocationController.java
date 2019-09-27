package com.example.test.controller;

import com.example.test.entity.Location;
import com.example.test.service.LocationService;
import com.example.test.utils.Result;
import com.example.test.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-09-27 15:01
 * @description:
 **/
@RestController
@Api(tags = "定位模块")
@RequestMapping(value = "location")
public class LocationController {

    @Autowired
    LocationService locationService;

    @PostMapping(value = "add")
    @ApiOperation(value = "新增")
    public Result add(@RequestBody Location location){
        return ResultUtil.success(locationService.add(location));
    }

    @GetMapping(value = "query")
    @ApiOperation(value = "查询")
    public Result getAll(){
        return ResultUtil.success(locationService.queryAll());
    }
}
