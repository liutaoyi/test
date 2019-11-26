package com.example.test.mapper;

import com.example.test.entity.Uzi;
import com.example.test.entity.UziExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UziMapper {
    int countByExample(UziExample example);

    int deleteByExample(UziExample example);

    int deleteByPrimaryKey(Long code);

    int insert(Uzi record);

    int insertSelective(Uzi record);

    List<Uzi> selectByExample(UziExample example);

    Uzi selectByPrimaryKey(Long code);

    int updateByExampleSelective(@Param("record") Uzi record, @Param("example") UziExample example);

    int updateByExample(@Param("record") Uzi record, @Param("example") UziExample example);

    int updateByPrimaryKeySelective(Uzi record);

    int updateByPrimaryKey(Uzi record);
}