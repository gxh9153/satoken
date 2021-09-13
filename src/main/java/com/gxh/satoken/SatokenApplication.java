package com.gxh.satoken;

import cn.dev33.satoken.SaManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SatokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SatokenApplication.class, args);
        System.out.println("启动成功：sa-token 配置如下"+ SaManager.getConfig());
    }

}
