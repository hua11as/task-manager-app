package com.taiping.tm.common.constants;

/**
 * desc:
 * author: as
 * date: 2019/8/15
 */
public final class AmqpConstants {
    public static final class ExchangeConstants {
        public static final String EX_AMQ_DIRECT = "amq.direct";
    }

    public final static class QueueConstants {
        public static final String QUE_CC_TASK_FLOW_START = "cc.task.flow.start";
        public static final String QUE_CC_TASK_FLOW_SUBMIT = "cc.task.flow.submit";
        public static final String QUE_CC_ALLOT_OPERATOR = "cc.allot.operator";

        public static final String QUE_CNC_TASK_FLOW_START = "cnc.task.flow.start";
        public static final String QUE_CNC_TASK_FLOW_SUBMIT = "cnc.task.flow.submit";
        public static final String QUE_CNC_ALLOT_OPERATOR = "cnc.allot.operator";

        public static final String QUE_UC_TASK_FLOW_START = "uc.task.flow.start";
        public static final String QUE_UC_TASK_FLOW_SUBMIT = "uc.task.flow.submit";
        public static final String QUE_UC_ALLOT_OPERATOR = "uc.allot.operator";
    }
}
