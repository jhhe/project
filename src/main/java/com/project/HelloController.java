package com.project;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by He on 2017/5/31.
 */
@RestController
@RequestMapping("/hello")
@Api(value = "hello", description = "hello test")
public class HelloController {

    @Autowired
    private DemoProperties demoProperties;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    @ApiIgnore
    public String print() {
        return demoProperties.getContextPath();
//        return "index";
    }

}
