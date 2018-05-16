package com.yc.generator.dao;

import com.yc.generator.entity.JdBjb;
import com.yc.generator.entity.JdBjbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JdBjbMapper {
    int countByExample(JdBjbExample example);

    int deleteByExample(JdBjbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JdBjb record);

    int insertSelective(JdBjb record);

    List<JdBjb> selectByExample(JdBjbExample example);

    JdBjb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JdBjb record, @Param("example") JdBjbExample example);

    int updateByExample(@Param("record") JdBjb record, @Param("example") JdBjbExample example);

    int updateByPrimaryKeySelective(JdBjb record);

    int updateByPrimaryKey(JdBjb record);
}