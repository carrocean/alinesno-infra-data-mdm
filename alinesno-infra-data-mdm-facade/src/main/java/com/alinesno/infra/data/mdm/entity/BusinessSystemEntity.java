package com.alinesno.infra.data.mdm.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 功能名：业务系统
 * 数据表：business_system
 * 表备注：
 *
 * @TableName 表名注解，用于指定数据库表名
 * @TableField 字段注解，用于指定数据库字段名
 *
 *@author luoxiaodong
 *@version 1.0.0
 */

@TableName("business_system")
public class BusinessSystemEntity extends InfraBaseEntity {

    // 业务系统标识
    @TableField("identity")
    private String identity;

    // 业务系统名称
    @TableField("name")
    private String name;

    // 备注
    @TableField("remark")
    private String remark;

    // 主键
    @TableField("id")
    private Long id;

    // Getter and Setter methods
    // ...
}
