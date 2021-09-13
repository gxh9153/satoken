package com.gxh.satoken.controller;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.gxh.satoken.common.api.CommonResult;
import com.gxh.satoken.domain.AdminUser;
import com.gxh.satoken.service.UserAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @description: 后台用户管理
 * @author: gxh
 * @create: 2021-09-09-17-21
 **/

@RestController
@Api(tags = "UserAdminController",description = "后台用户管理")
@RequestMapping("/admin")
public class UserAdminController {

    @Autowired
    private UserAdminService userAdminService;


    @ApiOperation(value = "登录后返回Token")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public CommonResult login(@RequestParam String username, @RequestParam String password){
        SaTokenInfo saTokenInfo = userAdminService.login(username, password);
        if(saTokenInfo == null){
            return CommonResult.validateFailed("用户名或密码错误");
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("token",saTokenInfo.getTokenValue());
        map.put("tokenHead",saTokenInfo.getTokenName());
        return CommonResult.success(map);
    }

    @ApiOperation(value = "查询当前登录状态")
    @RequestMapping(value = "/isLogin",method = RequestMethod.GET)
    public CommonResult isLogin(){
        return CommonResult.success(StpUtil.isLogin());
    }
}

