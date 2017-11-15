package com.wsun.springcloud.service.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
@Slf4j
public class UserController {
    private static final Logger logger = LogManager.getLogger(UserController.class);

    @Value("${global.db.driver}")
    private String driver;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String hello() {
        return "hello" + driver;
    }


    public static void main(String[] args) {
        logger.error("我去:{}", "这是啥");
    }
}
