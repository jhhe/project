package com.project;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("com.project.dao")
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }

    /**
     * Druid数据库配置
     *
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
//        WallFilter filter = new WallFilter();
//        WallConfig wallConfig = new WallConfig();
//        wallConfig.setStrictSyntaxCheck(false);
//        filter.setConfig(wallConfig);
//        druidDataSource.setProxyFilters(Lists.newArrayList(filter));
        return druidDataSource;
    }

}
