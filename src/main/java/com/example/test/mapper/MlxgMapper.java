package com.example.test.mapper;

import com.example.test.entity.Mlxg;
import com.example.test.entity.MlxgExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface MlxgMapper {
    int countByExample(MlxgExample example);

    int deleteByExample(MlxgExample example);

    int deleteByPrimaryKey(Long code);

    int insert(Mlxg record);

    int insertSelective(Mlxg record);

    List<Mlxg> selectByExample(MlxgExample example);

    Mlxg selectByPrimaryKey(Long code);

    int updateByExampleSelective(@Param("record") Mlxg record, @Param("example") MlxgExample example);

    int updateByExample(@Param("record") Mlxg record, @Param("example") MlxgExample example);

    int updateByPrimaryKeySelective(Mlxg record);

    int updateByPrimaryKey(Mlxg record);
}