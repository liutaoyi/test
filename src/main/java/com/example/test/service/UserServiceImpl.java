package com.example.test.service;

import com.example.test.entity.Xiaohu;
import com.example.test.entity.XiaohuExample;
import com.example.test.mapper.XiaohuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-08-21 20:48
 * @description:
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    XiaohuMapper mapper;

    @Override
    public void delete() {
        XiaohuExample example = new XiaohuExample();
        example.createCriteria().andFlagEqualTo(true);
        mapper.deleteByExample(example);
    }

    @Override
    public void add(Xiaohu xiaohu) {
        mapper.insertSelective(xiaohu);
    }
}
