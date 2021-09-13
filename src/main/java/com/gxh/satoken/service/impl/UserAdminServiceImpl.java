package com.gxh.satoken.service.impl;

import cn.dev33.satoken.secure.SaSecureUtil;
import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.gxh.satoken.domain.AdminUser;
import com.gxh.satoken.service.UserAdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @description: 用户登录ServiceImpl
 * @author: gxh
 * @create: 2021-09-09-17-31
 **/
@Slf4j
@Service
public class UserAdminServiceImpl implements UserAdminService {
    @Override
    public AdminUser getAdminByUsername(String username) {
        AdminUser adminUser = new AdminUser();
        adminUser.setId((long) 12345678);
        adminUser.setPassword("123456");
        adminUser.setUsername("admin");
        return adminUser;
    }

    @Override
    public AdminUser getAdminById(Long id) {
        return null;
    }

    @Override
    public SaTokenInfo login(String username, String password) {
        SaTokenInfo saTokenInfo = null;
        AdminUser adminUser = getAdminByUsername(username);
        if(adminUser == null){
            return null;
        }
        if(!password.equals(adminUser.getPassword())){
            return null;
        }
        //密码校验成功后登录
        StpUtil.login(adminUser.getId());
        //获取当前用户登录Token信息
        saTokenInfo = StpUtil.getTokenInfo();
        return saTokenInfo;
    }
}
