package com.example.test.mapper;

import com.example.test.entity.TbLocation;
import com.example.test.entity.TbLocationExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TbLocationMapper {
    int countByExample(TbLocationExample example);

    int deleteByExample(TbLocationExample example);

    int deleteByPrimaryKey(Long code);

    int insert(TbLocation record);

    int insertSelective(TbLocation record);

    List<TbLocation> selectByExample(TbLocationExample example);

    TbLocation selectByPrimaryKey(Long code);

    int updateByExampleSelective(@Param("record") TbLocation record, @Param("example") TbLocationExample example);

    int updateByExample(@Param("record") TbLocation record, @Param("example") TbLocationExample example);

    int updateByPrimaryKeySelective(TbLocation record);

    int updateByPrimaryKey(TbLocation record);
}