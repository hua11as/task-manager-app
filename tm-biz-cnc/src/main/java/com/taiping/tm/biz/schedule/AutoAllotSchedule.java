package com.taiping.tm.biz.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * desc:
 * author: as
 * date: 2019/8/16
 */
@Component
public class AutoAllotSchedule {

    @Scheduled(fixedDelay = 1000L)
    public void scanNoTaskOperator() {
        System.out.println("扫描没有任务的作业员，将作业员放入待分配队列");
    }
}
