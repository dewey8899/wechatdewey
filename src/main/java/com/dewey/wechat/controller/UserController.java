package com.dewey.wechat.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Administrator
 * Date 2018/12/1 0001 上午 11:41
 */
@RestController
@SpringBootApplication
public class UserController {
    @GetMapping("/getUser")
    public Map<String,Object> getUser(){
        System.out.println("微信小程序正在调用。。。");
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> list = new ArrayList<String>();
        list.add("杜威");
        list.add("陈冰");
        list.add("杜昱辰");
        list.add("杜承铠");
        map.put("list",list);
        System.out.println("微信小程序调用完成。。。");
        return map;

    }
    @GetMapping("")
    public String getText(){
        return "hello world";
    }
}
