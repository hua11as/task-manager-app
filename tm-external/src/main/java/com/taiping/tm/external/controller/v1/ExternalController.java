package com.taiping.tm.external.controller.v1;

import com.alibaba.fastjson.JSONObject;
import com.taiping.tm.external.dto.ExternalReqDTO;
import com.taiping.tm.external.dto.ExternalRespDTO;
import com.taiping.tm.external.feign.FlowFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc:
 * author: as
 * date: 2019/6/27
 */
@RestController
@RequestMapping("/external/v1")
public class ExternalController {

    @Autowired
    private FlowFeignService flowFeignService;

    @RequestMapping("/startFlow")
    public ExternalRespDTO startFlow(ExternalReqDTO reqDTO) {
        System.out.println(JSONObject.toJSONString(reqDTO));
        ExternalRespDTO respDTO = new ExternalRespDTO();

        System.out.println(flowFeignService.start());
        respDTO.setRespInfo("test response info.");
        return respDTO;
    }
}
