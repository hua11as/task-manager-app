package com.taiping.tm.biz.amqp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.taiping.tm.common.constants.RedisConstants;
import com.taiping.tm.common.dto.TaskFlowReqDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import static com.taiping.tm.common.constants.AmqpConstants.QueueConstants;

/**
 * desc:
 * author: as
 * date: 2019/8/15
 */
@Component
public class AmqpListeners {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @RabbitListener(queues = QueueConstants.QUE_CC_TASK_FLOW_START)
    public void taskFlowStartListener(TaskFlowReqDTO reqDTO) throws JsonProcessingException {
        // 将理赔车任务放入有序队列中
        redisTemplate.opsForZSet().add(RedisConstants.ZsetKeyConstants.ZSET_AUTO_ALLOT_CC, objectMapper.writeValueAsString(reqDTO),
                reqDTO.getScore());
    }

    @RabbitListener(queues = QueueConstants.QUE_CC_TASK_FLOW_SUBMIT)
    public void taskFlowSubmitListener() {

    }

    @RabbitListener(queues = QueueConstants.QUE_CC_ALLOT_OPERATOR)
    public void allotOperatorListener() {

    }
}
