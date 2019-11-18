package com.example.test.utils;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-11-18 09:26
 * @description:
 **/

public class DateUniversalUtil {

    //标准UTC时间示例 ：   2014-09-04T09:30:26.869Z
    public static Date convertUTC2Date(String utcDate) {
        try {
            DateTime dateTime = DateTime.parse(utcDate, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
            return dateTime.toDate();
        } catch (Exception e) {
            return null;
        }
    }

    public static String convertDate2UTC(Date javaDate) {
        DateTime dateTime = new DateTime(javaDate, DateTimeZone.UTC);
        return dateTime.toString();
    }

    public static String convertDate2LocalByDateFormat(Date javaDate, String dateFormat) {
        DateTime dateTime = new DateTime(javaDate);
        return dateTime.toString(dateFormat);
    }

    public static Date get7DaysAgo(Date javaDate) {
        DateTime dateTime = new DateTime(javaDate);

        return dateTime.minusDays(7).toDate();
    }

    public static Date getOneMonthAgo(Date javaDate) {
        DateTime dateTime = new DateTime(javaDate);
        return dateTime.minusMonths(1).toDate();
    }

    public static Date getTodayStart() {
        DateTime dateTime = new DateTime();
        return dateTime.withTimeAtStartOfDay().toDate();
    }

    public static Date getTodayEnd() {
        DateTime dateTime = new DateTime();
        return dateTime.withTimeAtStartOfDay().plusDays(1).minusMillis(1).toDate();
    }
}
