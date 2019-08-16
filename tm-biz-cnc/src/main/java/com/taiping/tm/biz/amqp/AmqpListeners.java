package com.taiping.tm.biz.amqp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.taiping.tm.common.constants.RedisConstants;
import com.taiping.tm.common.dto.TaskFlowReqDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Random;

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

    @RabbitListener(queues = QueueConstants.QUE_CNC_TASK_FLOW_START)
    public void taskFlowStartListener(TaskFlowReqDTO reqDTO) throws JsonProcessingException {
        // 生成任务的score
        Random r = new Random();
        double score = r.nextDouble()*1000000;

        // 将理赔车任务放入有序队列中
        redisTemplate.opsForZSet().add(RedisConstants.ZsetKeyConstants.ZSET_CNC_AUTO_ALLOT, objectMapper.writeValueAsString(reqDTO),
                score);
    }

    @RabbitListener(queues = QueueConstants.QUE_CNC_TASK_FLOW_SUBMIT)
    public void taskFlowSubmitListener() {

    }

    @RabbitListener(queues = QueueConstants.QUE_CNC_ALLOT_OPERATOR)
    public void allotOperatorListener() {

    }
}
