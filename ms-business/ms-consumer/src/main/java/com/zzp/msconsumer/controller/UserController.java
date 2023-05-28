package com.zzp.msconsumer.controller;

import com.zzp.msconsumer.controller.remoteService.IDepartService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class UserController {

    @Value("${current.namespace}")
    private String nameSpace;
    @Resource
    private IDepartService departService;

    @GetMapping("/nameSpace")
    public String getNameSpace(){
        System.out.printf("consumer getNameSpace");
        return "当前服务：consumer，当前nameSpace:" + nameSpace + "--远程服务调用结果:" + departService.getNameSpace();
    }
}
