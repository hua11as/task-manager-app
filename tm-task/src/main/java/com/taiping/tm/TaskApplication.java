package com.taiping.tm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * desc:
 * author: as
 * date: 2019/7/30
 */
@SpringBootApplication
@MapperScan("com.taiping.tm.persistence.dao")
public class TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class);
    }
}
