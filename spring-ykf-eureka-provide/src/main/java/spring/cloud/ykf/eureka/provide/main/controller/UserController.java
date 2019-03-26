package spring.cloud.ykf.eureka.provide.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.cloud.ykf.eureka.provide.main.entry.User;
import spring.cloud.ykf.eureka.provide.main.service.UserService;


/**
 * Author: Administrator
 * Date 2018/12/18 0018 下午 10:30
 */


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/query/{id}")
    public User findByIdUser(@PathVariable("id") Long id) {
        User us = userService.findUser(id);
        return us;
    }

    @RequestMapping(value = "/del/{id}")
    public String delUser(@PathVariable("id") Long id) {
        int num = userService.deleteUser(id);
        return num == 1 ? "succ" : "err";
    }

    @RequestMapping(value = "/save/{uname}/{pwd}")
    public String delUser(@PathVariable("uname") String uname, @PathVariable("pwd") String pwd) {
        User user = new User();
        user.setPswd(pwd);
        user.setUserName(uname);
        int num = userService.saveUser(user);
        return num == 1 ? "succ" : "err";
    }

}

