package com.taiping.tm.common.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * desc:
 * author: as
 * date: 2019/6/27
 */
@Data
@ToString
public class TaskFlowReqDTO implements Serializable {
    private static final long serialVersionUID = 5753011329268146497L;

    private String bizNo;
    private String taskType;
}
