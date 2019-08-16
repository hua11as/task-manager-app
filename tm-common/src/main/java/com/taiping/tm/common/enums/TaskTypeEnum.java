package com.taiping.tm.common.enums;

import com.taiping.tm.common.exceptions.EnumNotFoundException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * desc:
 * author: as
 * date: 2019/8/16
 */
@Getter
@AllArgsConstructor
public enum TaskTypeEnum {
    TYPE_1001("1001", BizTypeEnum.BIZ_UC, StationEnum.STA_AUDITOR, "报价审核"),
    TYPE_1002("1002", BizTypeEnum.BIZ_UC, StationEnum.STA_AUDITOR, "投保核保"),
    TYPE_1003("1003", BizTypeEnum.BIZ_UC, StationEnum.STA_AUDITOR, "批改核保"),

    TYPE_1100("1100", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "重大赔案审核"),
    TYPE_1101("1101", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "报价审核"),
    TYPE_1102("1102", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "定损审核"),
    TYPE_1103("1103", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "查勘审核"),
    TYPE_1104("1104", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "理算核赔"),
    TYPE_1105("1105", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "结案审核"),
    TYPE_1106("1106", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "报案注销审核"),
    TYPE_1107("1107", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "立案注销审核"),
    TYPE_1108("1108", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "分段赔付审核"),
    TYPE_1109("1109", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "预付审核"),
    TYPE_1110("1110", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "复勘审核"),
    TYPE_1111("1111", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "人伤查勘审核"),
    TYPE_1112("1112", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "人伤索赔计算"),
    TYPE_1113("1113", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "垫付审核"),
    TYPE_1117("1117", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "重开赔案审核"),
    TYPE_1118("1118", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "注销案件重开审核"),
    TYPE_1119("1119", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "诉讼审核"),
    TYPE_1120("1120", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "追偿审核"),
    TYPE_1121("1121", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "支付审核"),
    TYPE_1122("1122", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "支付退回"),
    TYPE_1123("1123", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "直接理赔费用审核"),
    TYPE_1124("1124", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "案件注销审核"),
    TYPE_1125("1125", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "特殊赔案（垫/支/预付审核）"),
    TYPE_1126("1126", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "调查任务审核"),
    TYPE_1127("1127", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "CCC查勘"),
    TYPE_1128("1128", BizTypeEnum.BIZ_CC, StationEnum.STA_AUDITOR, "理算"),
    TYPE_1201("1201", BizTypeEnum.BIZ_CC, StationEnum.STA_OPERATOR, "CCC定损"),
    TYPE_1202("1202", BizTypeEnum.BIZ_CC, StationEnum.STA_OPERATOR, "CCC复勘处理"),
    TYPE_1203("1203", BizTypeEnum.BIZ_CC, StationEnum.STA_OPERATOR, "单证收集"),
    TYPE_1204("1204", BizTypeEnum.BIZ_CC, StationEnum.STA_OPERATOR, "理算"),

    TYPE_2101("2101", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "人工立案审核"),
    TYPE_2102("2102", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "定损审核"),
    TYPE_2103("2103", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "查勘审核"),
    TYPE_2104("2104", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "查勘注销审核"),
    TYPE_2105("2105", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "理算审核"),
    TYPE_2106("2106", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "人工结案审核"),
    TYPE_2107("2107", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "立案注销审核"),
    TYPE_2108("2108", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "先行赔付审核"),
    TYPE_2109("2109", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "重开赔案审核"),
    TYPE_2110("2110", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "注销案件重开审核"),
    TYPE_2111("2111", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "诉讼审核"),
    TYPE_2112("2112", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "追偿审核"),
    TYPE_2113("2113", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "报案注销审核"),
    TYPE_2114("2114", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "非车直接理赔费用复核"),
    TYPE_2115("2115", BizTypeEnum.BIZ_CNC, StationEnum.STA_AUDITOR, "支付修改审核"),
    TYPE_2201("2201", BizTypeEnum.BIZ_CNC, StationEnum.STA_OPERATOR, "定损任务"),
    TYPE_2202("2202", BizTypeEnum.BIZ_CNC, StationEnum.STA_OPERATOR, "查勘任务"),
    TYPE_2203("2203", BizTypeEnum.BIZ_CNC, StationEnum.STA_OPERATOR, "立案任务"),
    TYPE_2204("2204", BizTypeEnum.BIZ_CNC, StationEnum.STA_OPERATOR, "理算任务");

    private String code;
    private BizTypeEnum bizType;
    private StationEnum station;
    private String desc;

    public static TaskTypeEnum keyOf(String key) {
        if (StringUtils.isEmpty(key)) {
            throw EnumNotFoundException.keyIsEmpty();
        }

        for (TaskTypeEnum em : TaskTypeEnum.values()) {
            if (em.code.equals(key)) {
                return em;
            }
        }

        throw EnumNotFoundException.enumNotFound(key, TaskTypeEnum.class);
    }
}
