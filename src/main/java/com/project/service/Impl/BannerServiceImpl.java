package com.project.service.Impl;

import com.project.dao.BannerMapper;
import com.project.model.Banner;
import com.project.model.BannerExample;
import com.project.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by He on 2017/6/2.
 */
@Service
public class BannerServiceImpl implements BannerService{

    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public List<Banner> getBanners() {
        BannerExample example = new BannerExample();
        example.createCriteria().andBidBetween(0,100);
        return bannerMapper.selectByExample(example);
    }

    @Override
    public Banner getBanner(int bid) {
        return bannerMapper.selectByPrimaryKey(bid);
    }

}
