package com.yuqn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: yuqn
 * @Date: 2023/4/14 19:23
 * @description:
 * 启动类
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
        log.info("============server-provider-demo项目启动了！=============");
    }
}
