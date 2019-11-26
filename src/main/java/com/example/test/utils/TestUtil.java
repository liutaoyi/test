package com.example.test.utils;

import java.util.Random;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-11-26 12:25
 * @description:
 **/

public class TestUtil {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(new Random().nextBoolean());
        }
        for (int i = 0; i < 50; i++) {
            System.out.println(Math.random());
        }
    }
}
