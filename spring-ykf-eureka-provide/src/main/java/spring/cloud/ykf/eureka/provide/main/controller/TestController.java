package spring.cloud.ykf.eureka.provide.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Administrator
 * Date 2018/12/3 0003 下午 10:29
 */

@RestController
public class TestController {

    @GetMapping(value = "/aa")
    public String aa() {
        return "aa";
    }

}
