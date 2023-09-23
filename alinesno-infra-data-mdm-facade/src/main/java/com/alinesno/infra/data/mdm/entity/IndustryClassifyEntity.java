package com.alinesno.infra.data.mdm.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 功能名：行业分类
 * 数据表：industry_classify
 * 表备注：
 *
 * @TableName 表名注解，用于指定数据库表名
 * @TableField 字段注解，用于指定数据库字段名
 *
 *@author luoxiaodong
 *@version 1.0.0
 */

@TableName("industry_classify")
@Data
public class IndustryClassifyEntity extends InfraBaseEntity {

    // 行业分类标识
    @TableField("identity")
    private String identity;

    // 行业分类名称
    @TableField("name")
    private String name;

    // 备注
    @TableField("remark")
    private String remark;

    // 父类ID
    @TableField("parent_id")
    private Long parentId;

    // 主键
    @TableField("id")
    private Long id;

    // Getter and Setter methods
    // ...
}
