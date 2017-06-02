package com.project.dao;

import com.project.model.Hear;
import com.project.model.HearExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HearMapper {
    int countByExample(HearExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(Hear record);

    int insertSelective(Hear record);

    List<Hear> selectByExample(HearExample example);

    Hear selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") Hear record, @Param("example") HearExample example);

    int updateByExample(@Param("record") Hear record, @Param("example") HearExample example);

    int updateByPrimaryKeySelective(Hear record);

    int updateByPrimaryKey(Hear record);
}