package com.yuqn.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 添加 feign 注解，@FeignClient
 * name：服务提供者名称
 * path：服务提供者控制器 @RequestMapping 内容，如果没有，不写
 */
@FeignClient(name="server-provider-demo")
@Service
public interface ServerService {

    /**
     * 定义接口对应接口，服务提供者怎么定义，就怎么写
     */
    @RequestMapping("test")
    String test();

    @RequestMapping("test1")
    String test1();
}
