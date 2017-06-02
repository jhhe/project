package com.project.dao;

import com.project.model.Overhear;
import com.project.model.OverhearExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OverhearMapper {
    int countByExample(OverhearExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Overhear record);

    int insertSelective(Overhear record);

    List<Overhear> selectByExample(OverhearExample example);

    Overhear selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") Overhear record, @Param("example") OverhearExample example);

    int updateByExample(@Param("record") Overhear record, @Param("example") OverhearExample example);

    int updateByPrimaryKeySelective(Overhear record);

    int updateByPrimaryKey(Overhear record);
}