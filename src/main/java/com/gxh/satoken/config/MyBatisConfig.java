package com.gxh.satoken.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("com.gxh.satoken.mbg.mapper")
public class MyBatisConfig {
}
