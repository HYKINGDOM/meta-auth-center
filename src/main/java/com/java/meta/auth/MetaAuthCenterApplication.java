package com.java.meta.auth;

import cn.dev33.satoken.SaManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hy
 */
@SpringBootApplication
public class MetaAuthCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetaAuthCenterApplication.class, args);
        System.out.println("meta-auth 启动成功，Sa-Token 配置如下：" + SaManager.getConfig());
    }

}
