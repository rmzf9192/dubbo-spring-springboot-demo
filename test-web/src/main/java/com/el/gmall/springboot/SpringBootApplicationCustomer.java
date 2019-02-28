package com.el.gmall.springboot;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Auther: roman.zhang
 * @Date: 2019/2/26 14:55
 * @Version:V1.0
 * @Description:SpringBootApplicationCustomer
 */
@EnableDubbo
@EnableHystrix
@SpringBootApplication
public class SpringBootApplicationCustomer {
    public static void main( String[] args ){
        SpringApplication.run(SpringBootApplicationCustomer.class,args);
    }
}
