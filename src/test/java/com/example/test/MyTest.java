package com.example.test;

import com.example.test.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-11-16 16:03
 * @description:
 **/

public class MyTest extends TestApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void test() {
        List<Map<String, Object>> stuInfos = userService.getStuInfo();

//        for (Map<String,Object> map : stuInfos){
//            map.forEach((k,v) -> System.out.println(k + " " + v));
//        }

        stuInfos.forEach(stuInfo -> stuInfo.forEach((k,v)-> System.out.println(k + " " + v)));
    }
}
