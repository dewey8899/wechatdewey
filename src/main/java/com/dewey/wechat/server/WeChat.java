package com.dewey.wechat.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Author: Dewey
 * Date: 2018-12-01 11:40:00
 */
@ComponentScan(basePackages= "com.dewey.wechat.*")//添加扫包@ComponentScan(basePackages= "")
@EnableAutoConfiguration
public class WeChat {

    public static void main(String[] args) {
        SpringApplication.run(WeChat.class, args);
    }
}
