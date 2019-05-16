package com.izi.demomultimodule.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyServiceI {
    @Override
    public String message() {
        return "Hello from lib.service.MyServiceImpl class";
    }
}
