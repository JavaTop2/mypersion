package com.yc.generator.dao;

import com.yc.generator.entity.SnSj;
import com.yc.generator.entity.SnSjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SnSjMapper {
    int countByExample(SnSjExample example);

    int deleteByExample(SnSjExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SnSj record);

    int insertSelective(SnSj record);

    List<SnSj> selectByExample(SnSjExample example);

    SnSj selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SnSj record, @Param("example") SnSjExample example);

    int updateByExample(@Param("record") SnSj record, @Param("example") SnSjExample example);

    int updateByPrimaryKeySelective(SnSj record);

    int updateByPrimaryKey(SnSj record);
}