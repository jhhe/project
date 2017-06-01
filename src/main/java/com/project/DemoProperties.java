package com.project;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by He on 2017/5/31.
 */
@Component
@ConfigurationProperties(prefix = "server")
public class DemoProperties {

    private Integer port;

    private String contextPath;

    public Integer getPort(){
        return port;
    }

    public void setPort(Integer port){
        this.port = port;
    }

    public String getContextPath(){
        return contextPath;
    }

    public void setContextPath(String contextPath){
        this.contextPath = contextPath;
    }

}
