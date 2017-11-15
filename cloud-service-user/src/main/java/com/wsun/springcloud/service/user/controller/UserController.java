package com.wsun.springcloud.service.user.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {
    private static final Logger logger = LogManager.getLogger(UserController.class);

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String hello() {
        logger.error("我去:{}", "hello");
        return "hello";
    }

    public static void main(String[] args) {
        logger.error("我去:{}", "hello");
    }

}
