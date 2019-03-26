package spring.cloud.ykf.eureka.provide.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author: Administrator
 * Date 2018/12/3 0003 下午 10:27
 */

//标明是服务提供者
@EnableEurekaClient
// springboot项目
@SpringBootApplication

@MapperScan("spring.cloud.ykf.eureka.provide.main.mapper")
public class EurekaProvideApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProvideApp.class, args);
        System.out.println("EurekaProvideApp  Service Start Success!");
    }

}
