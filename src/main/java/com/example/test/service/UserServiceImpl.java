package com.example.test.service;

import com.example.test.dto.MyDTO;
import com.example.test.dto.Page;
import com.example.test.entity.User;
import com.example.test.entity.UserExample;
import com.example.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-08-21 20:48
 * @description:
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> query() {
        UserExample userExample = new UserExample();
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.MONTH, -1);
        Date m = c.getTime();
        userExample.createCriteria().andBirthGreaterThan(m);
        return userMapper.selectByExample(userExample);
    }

//    @Override
//    public LoginDto loginForApp() {
//        LoginDto loginDto = userMapper.getLoginResponse();
//        return loginDto;
//    }
//
//    @Override
//    public LoginDto login(String username, String password) {
//        LoginDto loginDto = userMapper.login(username,password);
//        return loginDto;
//    }

    @Override
    public Page queryAll(Integer page, Integer size) {
        Page<User> pageInfo = new Page<>(size,page,query());
        return pageInfo;
    }

    @Override
    public int test(MyDTO myDTO) {
        if (myDTO.getTime() == null){
            TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
            myDTO.setTime(new Date());
        }
        System.out.println(myDTO.getTime());
        User user = new User();
        user.setUsername(myDTO.getUsername());
        user.setPassword(myDTO.getPassword());
        user.setBirth(myDTO.getTime());
        return userMapper.insertSelective(user);
    }
}
