package com.gxh.satoken.controller;

import com.gxh.satoken.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 品牌管理模块
 * @author: gxh
 * @create: 2021-09-13-12-22
 **/
@RestController
@RequestMapping("/brand")
@Api(tags = "BrandController",description = "品牌管理模块")
public class BrandController {

    @GetMapping("/listAll")
    @ApiOperation(value = "获取全部品牌信息")
    public CommonResult brandList(){
        return null;
    }
}
