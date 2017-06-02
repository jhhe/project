package com.project.dao;

import com.project.model.Praise;
import com.project.model.PraiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PraiseMapper {
    int countByExample(PraiseExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Praise record);

    int insertSelective(Praise record);

    List<Praise> selectByExample(PraiseExample example);

    Praise selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Praise record, @Param("example") PraiseExample example);

    int updateByExample(@Param("record") Praise record, @Param("example") PraiseExample example);

    int updateByPrimaryKeySelective(Praise record);

    int updateByPrimaryKey(Praise record);
}