package com.yc.generator.dao;

import com.yc.generator.entity.SnBjb;
import com.yc.generator.entity.SnBjbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SnBjbMapper {
    int countByExample(SnBjbExample example);

    int deleteByExample(SnBjbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SnBjb record);

    int insertSelective(SnBjb record);

    List<SnBjb> selectByExample(SnBjbExample example);

    SnBjb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SnBjb record, @Param("example") SnBjbExample example);

    int updateByExample(@Param("record") SnBjb record, @Param("example") SnBjbExample example);

    int updateByPrimaryKeySelective(SnBjb record);

    int updateByPrimaryKey(SnBjb record);
}