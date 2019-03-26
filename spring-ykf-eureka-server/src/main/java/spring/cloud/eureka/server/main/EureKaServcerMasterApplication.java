package spring.cloud.eureka.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Author: Administrator
 * Date 2018/12/3 0003 下午 9:41
 */
//标明当前是 注册中
@EnableEurekaServer
// 标明是springboot项目
@SpringBootApplication
public class EureKaServcerMasterApplication {
    public static void main(String[] args) {
        SpringApplication.run(EureKaServcerMasterApplication.class, args);
        System.out.println("EureKaServcerMasterApplication Service Start Success!");
    }
}
