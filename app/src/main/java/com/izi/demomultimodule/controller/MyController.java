package com.izi.demomultimodule.controller;

import com.izi.demomultimodule.service.MyServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyServiceI myService;

    @GetMapping("/")
    public String getMsg() {
        return myService.message();
    }
}
