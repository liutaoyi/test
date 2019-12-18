package com.example.test.service;

import com.example.test.entity.*;
import com.example.test.mapper.*;
import com.example.test.utils.ComUtil;
import com.example.test.utils.DateUniversalUtil;
import io.jsonwebtoken.lang.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.*;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-08-21 20:48
 * @description:
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    XiaohuMapper xiaohuMapper;

    @Autowired
    MlxgMapper mlxgMapper;

    @Autowired
    UziMapper uziMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    TbLocationMapper locationMapper;

    @Autowired
    StuInfoMapper infoMapper;

    @Override
    public void test() {
        Date a = new Date();
        Date b = new Date(a.getTime() + 24 * 60 * 60 * 1000);
//        String sql = "SELECT * FROM tb_xiaohu WHERE finish_time BETWEEN '" + a + "' AND '" + b + "'";
//
//        List<Xiaohu> xiaohus = xiaohuMapper.selectByCondition(sql);
        System.out.println(a);
        System.out.println(b);

        XiaohuExample example = new XiaohuExample();

        XiaohuExample.Criteria criteria1 = example.createCriteria();
        criteria1.andFinishTimeGreaterThan(b).andFlagEqualTo(true);

        XiaohuExample.Criteria criteria2 = example.createCriteria();
        criteria2.andFinishTimeLessThan(a).andFlagEqualTo(true);

        example.or(criteria2);
        List<Xiaohu> xiaohus = xiaohuMapper.selectByExample(example);

        xiaohus.forEach(xiaohu -> System.out.println(xiaohu.toString()));
    }

    @Override
    public void test1() {
        MlxgExample example = new MlxgExample();
        example.createCriteria();
        List<Mlxg> mlxgs = mlxgMapper.selectByExample(example);

//        mlxgs.sort((Mlxg o1,Mlxg o2) -> o1.getNum()-o2.getNum()>=0 ? -1 : 1);

//        mlxgs.sort((x, y) -> {

//            if (x.getFinishTime().getDate() == y.getFinishTime().getDate()) {
//                return x.getNum() - y.getNum() >= 0 ? -1 : 1;
//            } else
//                return x.getFinishTime().getTime() - y.getFinishTime().getTime() >= 0 ? -1 : 1;
//        });

//
        mlxgs.sort((x, y) -> {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
            int a = Integer.parseInt(dateFormat.format(x.getFinishTime()));
            int b = Integer.parseInt(dateFormat.format(y.getFinishTime()));
            if (a == b) {
                return y.getNum() - x.getNum();
            } else {
                return b - a;
            }
        });
        mlxgs.forEach(mlxg -> System.out.println(mlxg.toString()));
    }

    @Override
    public void test2() {
        XiaohuExample example = new XiaohuExample();
        Date d1 = DateUniversalUtil.getTodayStart();
        Date d2 = DateUniversalUtil.getTodayEnd();
        example.createCriteria().andFinishTimeBetween(d1, d2);
        List<Xiaohu> xiaohus = xiaohuMapper.selectByExample(example);
        xiaohus.forEach(xiaohu -> System.out.println(xiaohu.toString()));
        xiaohus.forEach(xiaohu -> System.out.println(xiaohu));
    }

    @Override
    public String test3(Integer code) {
        if (code == 1) {
            return code.toString();
        } else {
            return null;
        }
    }

    @Override
    public void test4() {
        Uzi uzi = new Uzi();
        uzi.setProcess("AB");
        uziMapper.insertSelective(uzi);
    }

    @Override
    public List<Map<String, Object>> getStuInfo() {
        return studentMapper.getStuInfo();
    }

    @Override
    public void test5() {
        Instant start = Instant.now();

        for (int i = 0; i < 10000; i++) {
            Xiaohu xiaohu = new Xiaohu();
            xiaohu.setFlag(new Random().nextBoolean());
            xiaohu.setFinishTime(new Date());
            xiaohuMapper.insertSelective(xiaohu);
        }

        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).toMillis(); // 单位为毫秒

        System.out.println(timeElapsed);
    }

    @Override
    public void test6() {
//        XiaohuExample example = new XiaohuExample();
//        example.createCriteria();
//        List<Xiaohu> xiaohus = xiaohuMapper.selectByExample(example);
//        xiaohus.forEach(System.out::println);
//        TbLocationExample example = new TbLocationExample();
//        example.createCriteria();
//        List<TbLocation> tbLocations = locationMapper.selectByExample(example);
//        tbLocations.forEach(System.out::println);
        StuInfoExample example = new StuInfoExample();
        example.createCriteria();
        example.setCurrentPage((1 - 1) * 1);
        example.setPageSize(1);
        List<StuInfo> stuInfos = infoMapper.selectByExample(example);
        stuInfos.forEach(System.out::println);
    }

    @Override
    public void test7() {
        StudentExample example = new StudentExample();
        example.createCriteria().andIdEqualTo(1L);
        Student student = new Student();
        student.setName("孔子");
        studentMapper.updateByExampleSelective(student, example);
    }

    @Override
    public void test8() {
        Student student = new Student();
        student.setId((long) 1);
        student.setName("蔡徐坤");
        studentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public String test9(String time) {
        if (time == null) {
            return "hello";
        }
        if (time.equals("")) {
            return "fuck";
        }
        return "world";
    }

    @Override
    public List test10(String time) {
        if (time == null) {
            return Arrays.asList("请联系管理员");
        } else {
            return Arrays.asList("success");
        }

    }

    @Override
    public void test11(Integer[] ids, Integer lineCode) {
        for (Integer id : ids) {
            System.out.println(id);
            System.out.println(lineCode);
        }
    }

    @Override
    public List test12(Integer id) {
        if (id == 1) {
            List<String> strings = Arrays.asList("213", "3231");
            return strings;
        }
        return new ArrayList();
    }

    @Override
    public List test13() {
        StudentExample example = new StudentExample();
        example.createCriteria().andSexEqualTo("a");
        List<Student> students = studentMapper.selectByExample(example);
        Assert.notEmpty(students, "无数据");
        return Arrays.asList(1, 2, 3);
    }

    @Override
    public List test14(String startTime, String endTime) {

        System.out.println("开始 " + startTime);
        System.out.println("结束 " + endTime);


        if ("".equals(startTime) && "".equals(endTime)) {
            System.out.println("=======");
            return Arrays.asList("a", "a", "a");
        } else {
            System.out.println("*******");
            return Arrays.asList("b", "b", "b");
        }
    }

    @Override
    public Object test15(Xiaohu xiaohu) {
        Xiaohu xiaohu1 = xiaohuMapper.selectByPrimaryKey(3L);
        if (xiaohu.getFinishTime().equals(xiaohu1.getFinishTime())) {
            return ComUtil.dateToString(xiaohu1.getFinishTime(), "yyyy-MM-dd HH:mm:ss");
        } else {
            return "-1";
        }
    }

    @Override
    public void test16(Xiaohu xiaohu) {
        xiaohuMapper.insertSelective(xiaohu);

    }
}
