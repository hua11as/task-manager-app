package com.taiping.tm.external.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * desc:
 * author: as
 * date: 2019/7/1
 */
@FeignClient(value = "tm-flow", url = "localhost:9092")
public interface FlowFeignService {

    @PostMapping("/flow/start")
    String start();
}
