package org.example.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 因为我们是一个SpringBoot分层项目,为了扫描所有的目录, 我们需要手动设置包扫描的类路径
@SpringBootApplication(scanBasePackages = "org.example")
// mybatis 的 mapper 接口所在的包
@MapperScan("org.example.mapper")
public class SimpleMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleMallApplication.class, args);
    }
}
