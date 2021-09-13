package com.gxh.satoken.common.exception;

import cn.dev33.satoken.exception.NotLoginException;
import com.gxh.satoken.common.api.CommonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 全局异常处理
 * @author: gxh
 * @create: 2021-09-13-12-17
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理未登录异常
     */
    @ResponseBody
    @ExceptionHandler(value = NotLoginException.class)
    public CommonResult  handleNotLoginException(NotLoginException e){
        return CommonResult.unauthorized(e.getMessage());
    }
}
