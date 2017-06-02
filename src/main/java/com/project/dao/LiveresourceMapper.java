package com.project.dao;

import com.project.model.Liveresource;
import com.project.model.LiveresourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiveresourceMapper {
    int countByExample(LiveresourceExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Liveresource record);

    int insertSelective(Liveresource record);

    List<Liveresource> selectByExample(LiveresourceExample example);

    Liveresource selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Liveresource record, @Param("example") LiveresourceExample example);

    int updateByExample(@Param("record") Liveresource record, @Param("example") LiveresourceExample example);

    int updateByPrimaryKeySelective(Liveresource record);

    int updateByPrimaryKey(Liveresource record);
}