package com.yc.generator.dao;

import com.yc.generator.entity.JdSj;
import com.yc.generator.entity.JdSjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JdSjMapper {
    int countByExample(JdSjExample example);

    int deleteByExample(JdSjExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JdSj record);

    int insertSelective(JdSj record);

    List<JdSj> selectByExample(JdSjExample example);

    JdSj selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JdSj record, @Param("example") JdSjExample example);

    int updateByExample(@Param("record") JdSj record, @Param("example") JdSjExample example);

    int updateByPrimaryKeySelective(JdSj record);

    int updateByPrimaryKey(JdSj record);
}