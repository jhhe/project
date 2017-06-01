package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by He on 2017/5/31.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private DemoProperties demoProperties;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String print() {
        return demoProperties.getContextPath();
//        return "index";
    }

}
