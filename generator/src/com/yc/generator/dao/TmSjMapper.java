package com.yc.generator.dao;

import com.yc.generator.entity.TmSj;
import com.yc.generator.entity.TmSjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmSjMapper {
    int countByExample(TmSjExample example);

    int deleteByExample(TmSjExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TmSj record);

    int insertSelective(TmSj record);

    List<TmSj> selectByExample(TmSjExample example);

    TmSj selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TmSj record, @Param("example") TmSjExample example);

    int updateByExample(@Param("record") TmSj record, @Param("example") TmSjExample example);

    int updateByPrimaryKeySelective(TmSj record);

    int updateByPrimaryKey(TmSj record);
}