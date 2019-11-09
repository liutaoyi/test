package com.example.test.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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

    @Test
    public void testInsert() {
        MyUser myUser = new MyUser();
        myUser.setName("小小小马云");
        myUser.setAge(1);
        myUser.setEmail("336699@qq.com");
        int rows = myUserMapper.insert(myUser);
        Assert.assertEquals(1, rows);
        System.out.println("影响记录数: " + rows);
    }

    @Test
    public void testRetrieve() {
//        MyUser myUser = myUserMapper.selectById(1L);
//        System.out.println(myUser);

//        List<Long> list = Arrays.asList(1L, 2L, 3L);
//        List<MyUser> myUsers = myUserMapper.selectBatchIds(list);
//        myUsers.forEach(System.out::println);

//        Map<String,Object> map = new HashMap<>();
//        map.put("name","Jone");
//        List<MyUser> myUsers1 = myUserMapper.selectByMap(map);
//        myUsers1.forEach(System.out::println);

        QueryWrapper<MyUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "").lt("age", 100);
        List<MyUser> myUsers = myUserMapper.selectList(queryWrapper);
        myUsers.forEach(System.out::println);
    }
}
