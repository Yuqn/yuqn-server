package com.yuqn.controller;

import com.yuqn.service.ServerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ServerController {

    @Resource
    private ServerService serverService;

    @RequestMapping("test")
    public String test(){
        String msg=serverService.test();
        return msg;
    }

    @RequestMapping("test1")
    public String test1(){
        String msg=serverService.test1();
        return msg;
    }
}
