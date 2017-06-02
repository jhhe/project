package com.project.dao;

import com.project.model.Usercategory;
import com.project.model.UsercategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsercategoryMapper {
    int countByExample(UsercategoryExample example);

    int deleteByPrimaryKey(Integer ucid);

    int insert(Usercategory record);

    int insertSelective(Usercategory record);

    List<Usercategory> selectByExample(UsercategoryExample example);

    Usercategory selectByPrimaryKey(Integer ucid);

    int updateByExampleSelective(@Param("record") Usercategory record, @Param("example") UsercategoryExample example);

    int updateByExample(@Param("record") Usercategory record, @Param("example") UsercategoryExample example);

    int updateByPrimaryKeySelective(Usercategory record);

    int updateByPrimaryKey(Usercategory record);
}