package com.alinesno.infra.data.mdm.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 功能名：数据详情日志
 * 数据表：data_detail_log
 * 表备注：
 *
 * @TableName 表名注解，用于指定数据库表名
 * @TableField 字段注解，用于指定数据库字段名
 *
 *@author luoxiaodong
 *@version 1.0.0
 */

@TableName("data_detail_log")
public class DataDetailLogEntity extends InfraBaseEntity {

    // 标识
    @TableField("identity")
    private String identity;

    // 简称
    @TableField("short_name")
    private String shortName;

    // 名称
    @TableField("standard_name")
    private String standardName;

    // 代码
    @TableField("code")
    private String code;

    // 类型
    @TableField("type")
    private String type;

    // 长度
    @TableField("length")
    private String length;

    // 说明
    @TableField("standard_desc")
    private String standardDesc;

    // 质量标准
    @TableField("quality")
    private String quality;

    // 数据标准状态
    @TableField("standard_status")
    private Long standardStatus;

    // 备注
    @TableField("remark")
    private String remark;

    // 分类ID
    @TableField("classify_id")
    private Long classifyId;

    // 主数据目录_id
    @TableField("cata_id")
    private Long cataId;

    // 原ID
    @TableField("old_id")
    private Long oldId;

    // 主键
    @TableField("id")
    private Long id;

    // Getter and Setter methods
    // ...
}
