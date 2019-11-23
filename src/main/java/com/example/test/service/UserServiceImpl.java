package com.example.test.service;

import com.example.test.entity.*;
import com.example.test.mapper.MlxgMapper;
import com.example.test.mapper.StudentMapper;
import com.example.test.mapper.UziMapper;
import com.example.test.mapper.XiaohuMapper;
import com.example.test.utils.DateUniversalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
        if (code == 1){
            return code.toString();
        }else{
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
}
