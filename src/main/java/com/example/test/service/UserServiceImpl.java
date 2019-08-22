package com.example.test.service;

import com.example.test.dto.LoginDto;
import com.example.test.entity.User;
import com.example.test.entity.UserExample;
import com.example.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        userExample.createCriteria();
        return userMapper.selectByExample(userExample);
    }

    @Override
    public LoginDto loginForApp() {
        LoginDto loginDto = userMapper.getLoginResponse();
        return loginDto;
    }

    @Override
    public LoginDto login(String username, String password) {
        LoginDto loginDto = userMapper.login(username,password);
        return loginDto;
    }
}
