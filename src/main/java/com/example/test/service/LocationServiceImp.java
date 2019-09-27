package com.example.test.service;

import com.example.test.entity.Location;
import com.example.test.entity.LocationExample;
import com.example.test.mapper.LocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-09-27 15:03
 * @description:
 **/
@Service
public class LocationServiceImp implements LocationService {

    @Autowired
    LocationMapper locationMapper;

    @Override
    public Location add(Location location) {
        locationMapper.insertSelective(location);
        return location;
    }

    @Override
    public List queryAll() {
        LocationExample example = new LocationExample();
        example.createCriteria();
        return locationMapper.selectByExample(example);
    }
}
