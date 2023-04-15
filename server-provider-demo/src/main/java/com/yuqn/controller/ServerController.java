package com.yuqn.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yuqn
 * @Date: 2023/4/14 19:26
 * @description:
 * 服务提供者
 * @version: 1.0
 */
@RestController
@Api(tags = "服务提供者")
public class ServerController {

    /**
     * @author: yuqn
     * @Date: 2023/4/14 19:27
     * @description:
     * test接口
     * @param: null
     * @return: null
     */
    @RequestMapping("test")
    @ApiOperation("test方法")
    public String test(){
        return "test服务";
    }

    /**
     * @author: yuqn
     * @Date: 2023/4/14 19:27
     * @description:
     * test1接口
     * @param: null
     * @return: null
     */
    @RequestMapping("test1")
    @ApiOperation("test1方法")
    public String test1(){
        return "test1服务";
    }
}
