package com.gxh.satoken.service;

import cn.dev33.satoken.stp.SaTokenInfo;
import com.gxh.satoken.domain.AdminUser;

/**
 * @description: 后台用户管理Service
 * @author: gxh
 * @create: 2021-09-09-17-25
 **/
public interface UserAdminService {

    /**
     * 根据用户名获取用户信息
     */
    AdminUser getAdminByUsername(String username);

    /**
     * 根据用户ID获取用户
     */
    AdminUser getAdminById(Long id);

    /**
     * 用户名密码登录
     */
    SaTokenInfo login(String username, String password);
}
