package com.taiping.tm.external.amqp;

/**
 * desc:
 * author: as
 * date: 2019/8/14
 */
public final class AmqpConstants {

    public static final class ExchangeConstants{
        public static final String EX_AMQ_DIRECT = "amq.direct";
    }

    public final static class QueueConstants{
        public static final String QUE_CC_TASK_FLOW_START = "cc.task.flow.start";
        public static final String QUE_CC_TASK_FLOW_SUBMIT = "cc.task.flow.submit";
    }
}
