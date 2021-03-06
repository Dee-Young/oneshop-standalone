package com.gelvt.oneshop.common.constant;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.gelvt.oneshop.common.enumeration.TypedEnum;
import com.gelvt.oneshop.common.json.StringEnumJsonSerializer;

/**
 * 一些系统内建角色名
 * @author: Elvin Zeng
 * @date: 17-7-6.
 */
@JsonSerialize(using=StringEnumJsonSerializer.class)
public enum RoleName implements TypedEnum<String> {
    /**
     * 超级用户
     */
    ROOT("role_root"),
    /**
     * 消费者
     */
    COMSUMER("role_comsumer")
    ;

    private String value;

    RoleName(String value){
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
