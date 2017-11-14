package com.wsun.springcloud.service.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String hello() {
        return "hello";
    }
}
