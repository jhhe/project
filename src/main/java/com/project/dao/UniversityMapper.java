package com.project.dao;

import com.project.model.University;
import com.project.model.UniversityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UniversityMapper {
    int countByExample(UniversityExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(University record);

    int insertSelective(University record);

    List<University> selectByExample(UniversityExample example);

    University selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") University record, @Param("example") UniversityExample example);

    int updateByExample(@Param("record") University record, @Param("example") UniversityExample example);

    int updateByPrimaryKeySelective(University record);

    int updateByPrimaryKey(University record);
}