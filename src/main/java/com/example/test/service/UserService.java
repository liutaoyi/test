package com.example.test.service;

import com.example.test.dto.MyDTO;
import com.example.test.dto.Page;
import com.example.test.entity.User;

import java.util.List;

public interface UserService {
    void insert(User user);
    List<User> query();
//    LoginDto loginForApp();
//    LoginDto login(String username,String password);
    Page queryAll(Integer page,Integer size);
    int test(MyDTO myDTO);
}
