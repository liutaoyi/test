package com.example.test.utils;

import java.text.DecimalFormat;
import java.text.Format;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-11-26 12:25
 * @description:
 **/

public class TestUtil {
    public static void main(String[] args) {
        String str = "099";
        Format format = new DecimalFormat("000");
        String format1 = format.format(Integer.parseInt(str) + 1);
        System.out.println(format1);
    }
}
