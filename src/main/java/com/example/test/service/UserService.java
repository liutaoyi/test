package com.example.test.service;

import com.example.test.entity.Xiaohu;

import java.util.List;
import java.util.Map;

public interface UserService {

    void test();

    void test1();

    void test2();

    String test3(Integer code);

    void test4();

    void test5();

    void test6();

    List<Map<String, Object>> getStuInfo();

    void test7();

    void test8();

    String test9(String time);

    List test10(String time);

    void test11(Integer[] ids, Integer lineCode);

    List test12(Integer id);

    List test13();

    List test14(String startTime, String endTime);

    Object test15(Xiaohu xiaohu);

    void test16(Xiaohu xiaohu);
}
