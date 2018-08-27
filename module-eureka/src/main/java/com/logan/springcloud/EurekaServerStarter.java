package com.logan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心Server
 * Created by Logan on 2018/8/26.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerStarter {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStarter.class, args);
    }

}
