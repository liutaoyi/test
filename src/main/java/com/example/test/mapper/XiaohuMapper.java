package com.example.test.mapper;

import com.example.test.entity.Xiaohu;
import com.example.test.entity.XiaohuExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface XiaohuMapper {
    int countByExample(XiaohuExample example);

    int deleteByExample(XiaohuExample example);

    int deleteByPrimaryKey(Long code);

    int insert(Xiaohu record);

    int insertSelective(Xiaohu record);

    List<Xiaohu> selectByExample(XiaohuExample example);

    Xiaohu selectByPrimaryKey(Long code);

    int updateByExampleSelective(@Param("record") Xiaohu record, @Param("example") XiaohuExample example);

    int updateByExample(@Param("record") Xiaohu record, @Param("example") XiaohuExample example);

    int updateByPrimaryKeySelective(Xiaohu record);

    int updateByPrimaryKey(Xiaohu record);

    List<Xiaohu> selectByCondition(@Param("sql") String sql);
}