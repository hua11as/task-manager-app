package com.taiping.tm.external.controller.v1;

import com.meyacom.stone.controller.dto.BaseRespDTO;
import com.taiping.tm.external.controller.dto.TaskFlowReqDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.taiping.tm.external.amqp.AmqpConstants.QueueConstants;

/**
 * desc:
 * author: as
 * date: 2019/6/27
 */
@RestController
@RequestMapping("/external/v1/taskFlow")
public class TaskFlowController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/start")
    public BaseRespDTO start(@RequestBody TaskFlowReqDTO reqDTO) {
        // step1：发送MQ
        rabbitTemplate.convertAndSend(QueueConstants.QUE_CC_TASK_FLOW_START, reqDTO);

        // step2: 记录日志

        return BaseRespDTO.buildSucc();
    }
}
