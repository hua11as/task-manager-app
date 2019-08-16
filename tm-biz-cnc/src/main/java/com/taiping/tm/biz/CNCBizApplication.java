package com.taiping.tm.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * desc:
 * author: as
 * date: 2019/8/14
 */
@SpringBootApplication
@EnableScheduling
public class CNCBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(CNCBizApplication.class, args);
    }
}
