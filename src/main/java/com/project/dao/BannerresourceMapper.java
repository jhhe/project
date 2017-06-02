package com.project.dao;

import com.project.model.Bannerresource;
import com.project.model.BannerresourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerresourceMapper {
    int countByExample(BannerresourceExample example);

    int deleteByPrimaryKey(Integer brid);

    int insert(Bannerresource record);

    int insertSelective(Bannerresource record);

    List<Bannerresource> selectByExample(BannerresourceExample example);

    Bannerresource selectByPrimaryKey(Integer brid);

    int updateByExampleSelective(@Param("record") Bannerresource record, @Param("example") BannerresourceExample example);

    int updateByExample(@Param("record") Bannerresource record, @Param("example") BannerresourceExample example);

    int updateByPrimaryKeySelective(Bannerresource record);

    int updateByPrimaryKey(Bannerresource record);
}