package com.example.test.service;

import com.example.test.entity.UserExample;
import com.example.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public List getByCondition(Date time) {
        UserExample example = new UserExample();
        example.createCriteria().andBirthGreaterThan(time);
        return userMapper.selectByExample(example);
    }
}
