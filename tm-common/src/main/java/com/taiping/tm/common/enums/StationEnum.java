package com.taiping.tm.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * desc:
 * author: as
 * date: 2019/8/16
 */
@Getter
@AllArgsConstructor
public enum StationEnum {
    STA_AUDITOR((byte) 1, "审核岗"),
    STA_OPERATOR((byte) 2, "操作岗");

    private byte type;
    private String desc;
}
