package com.example.test.service;

import com.example.test.entity.MyUser;
import com.example.test.mapper.MyUserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-11-08 23:37
 * @description:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {
    @Autowired
    MyUserMapper myUserMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<MyUser> userList = myUserMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
}
