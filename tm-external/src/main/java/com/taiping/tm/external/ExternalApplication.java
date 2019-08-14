package com.taiping.tm.external;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * desc:
 * author: as
 * date: 2019/6/27
 */
@SpringBootApplication
@EnableEurekaClient
public class ExternalApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExternalApplication.class);
    }
}
