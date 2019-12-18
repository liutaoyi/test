package com.example.test;

import com.example.test.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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
        userService.test8();
    }
}
