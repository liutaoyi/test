package com.example.test.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-11-26 12:25
 * @description:
 **/

public class TestUtil {
    public static void main(String[] args) {
        LocalDateTime of = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
        System.out.println(of);
    }
}
