package spring.cloud.ykf.eureka.consumer.main;

import org.springframework.boot.SpringApplication;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author: Administrator
 * Date 2018/12/17 0017 下午 10:03
 */

@EnableEurekaClient
@SpringBootApplication
public class EurekaConsumeApp {
    @Bean
    @LoadBalanced//实现负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumeApp.class, args);
        System.out.println("EurekaConsumeApp  Service Start Success!");
    }

}
