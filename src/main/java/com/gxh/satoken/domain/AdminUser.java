package com.gxh.satoken.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * @description: 登录用户
 * @author: gxh
 * @create: 2021-09-09-17-27
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class AdminUser {
    private Long id;
    private String username;
    private String password;
    private Long roleId;
    private AdminRole role;
}