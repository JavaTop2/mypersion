package com.yc.generator.dao;

import com.yc.generator.entity.TmBjb;
import com.yc.generator.entity.TmBjbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmBjbMapper {
    int countByExample(TmBjbExample example);

    int deleteByExample(TmBjbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TmBjb record);

    int insertSelective(TmBjb record);

    List<TmBjb> selectByExample(TmBjbExample example);

    TmBjb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TmBjb record, @Param("example") TmBjbExample example);

    int updateByExample(@Param("record") TmBjb record, @Param("example") TmBjbExample example);

    int updateByPrimaryKeySelective(TmBjb record);

    int updateByPrimaryKey(TmBjb record);
}