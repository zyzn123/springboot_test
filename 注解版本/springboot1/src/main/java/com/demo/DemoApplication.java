package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by cmcc on 2020-02-10.
 */

//https://my.oschina.net/u/4006148/blog/3164407
    

@MapperScan(value="com.demo.mapper")
@SpringBootApplication
//@EnableWebMvc
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}