package com.zzp.msprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class DepartController {

    @Value("${current.namespace}")
    private String nameSpace;
    @GetMapping("/nameSpace")
    public String getNameSpace(){
        System.out.printf("provider getNameSpace");
        return nameSpace + "----provider";
    }

}
