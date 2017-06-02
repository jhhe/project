package com.project.dao;

import com.project.model.Live;
import com.project.model.LiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiveMapper {
    int countByExample(LiveExample example);

    int deleteByPrimaryKey(Integer lid);

    int insert(Live record);

    int insertSelective(Live record);

    List<Live> selectByExample(LiveExample example);

    Live selectByPrimaryKey(Integer lid);

    int updateByExampleSelective(@Param("record") Live record, @Param("example") LiveExample example);

    int updateByExample(@Param("record") Live record, @Param("example") LiveExample example);

    int updateByPrimaryKeySelective(Live record);

    int updateByPrimaryKey(Live record);
}