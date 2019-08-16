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
public enum BizTypeEnum {
    BIZ_CC((byte) 1, "车险理赔"),
    BIZ_CNC((byte) 2, "非车理赔"),
    BIZ_UC((byte) 3, "车险承保");

    private byte type;
    private String desc;
}
