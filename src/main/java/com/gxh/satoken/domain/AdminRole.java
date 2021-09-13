package com.gxh.satoken.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @description: 用户相关角色
 * @author: gxh
 * @create: 2021-09-09-17-28
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class AdminRole {
    private Long id;
    private String name;
    private List<String> permissionList;
}
