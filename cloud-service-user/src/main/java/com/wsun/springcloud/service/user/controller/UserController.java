package com.wsun.springcloud.service.user.controller;

import com.wsun.springcloud.service.user.pojo.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserByID(@PathVariable Long id) {
        log.debug("应用:{}根据ID:{}查询用户信息", applicationName, id);
        User user = new User();
        user.setId(id);
        user.setUserName("小李");
        return user;
    }

}
