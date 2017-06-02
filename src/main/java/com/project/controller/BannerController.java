package com.project.controller;

import com.project.model.Banner;
import com.project.service.BannerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by He on 2017/6/2.
 */
@RestController
@RequestMapping("/banner")
@Api(value = "banner", description = "dome controller")
public class BannerController {

    @Autowired
    private BannerService bannerService;

//    @GetMapping(value = "/all")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ApiOperation(value = "获取所有banner信息", notes = "查询1-100")
    public List<Banner> getBanners(){
        return bannerService.getBanners();
    }

}
