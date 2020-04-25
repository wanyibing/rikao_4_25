package com.wanyibing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class GatewayAppliction {
    /**
     * 启动类
     * @param args
     */
    public static void main(String[] args) {

        SpringApplication.run(GatewayAppliction.class,args);


    }
}
