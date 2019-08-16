package com.taiping.tm.external.controller.v1;

import com.meyacom.stone.controller.dto.BaseRespDTO;
import com.taiping.tm.common.dto.TaskFlowReqDTO;
import com.taiping.tm.common.enums.TaskTypeEnum;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.taiping.tm.common.constants.AmqpConstants.ExchangeConstants;
import static com.taiping.tm.common.constants.AmqpConstants.QueueConstants;

/**
 * desc:
 * author: as
 * date: 2019/6/27
 */
@RestController
@RequestMapping("/v1/taskFlow")
public class TaskFlowController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/start")
    public BaseRespDTO start(@RequestBody TaskFlowReqDTO reqDTO) {
        TaskTypeEnum taskTypeEnum = TaskTypeEnum.keyOf(reqDTO.getTaskType());

        // step1：发送MQ
        switch (taskTypeEnum.getBizType()) {
            case BIZ_CC:
                rabbitTemplate.convertAndSend(ExchangeConstants.EX_AMQ_DIRECT, QueueConstants.QUE_CC_TASK_FLOW_START,
                        reqDTO);
                break;
            case BIZ_CNC:
                rabbitTemplate.convertAndSend(ExchangeConstants.EX_AMQ_DIRECT, QueueConstants.QUE_CNC_TASK_FLOW_START,
                        reqDTO);
                break;
            case BIZ_UC:
                rabbitTemplate.convertAndSend(ExchangeConstants.EX_AMQ_DIRECT, QueueConstants.QUE_UC_TASK_FLOW_START,
                        reqDTO);
                break;
            default:
                break;
        }

        // step2: 记录日志

        return BaseRespDTO.buildSucc();
    }
}
