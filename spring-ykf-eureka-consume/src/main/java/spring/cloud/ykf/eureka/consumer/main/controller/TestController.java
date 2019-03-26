package spring.cloud.ykf.eureka.consumer.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * Author: Administrator
 * Date 2018/12/17 0017 下午 10:10
 */

@Controller
@Configuration
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/aa")
    @ResponseBody
    public String add() {
        return restTemplate.getForEntity("http://spring-ykf-eureka-provide/aa/", String.class).getBody();
    }

}
