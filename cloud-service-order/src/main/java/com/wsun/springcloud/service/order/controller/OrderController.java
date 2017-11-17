package com.wsun.springcloud.service.order.controller;

import com.wsun.springcloud.service.order.feign.UserFeign;
import com.wsun.springcloud.service.order.pojo.domain.Order;
import com.wsun.springcloud.service.order.pojo.rpc.result.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private UserFeign userFeign;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Order getOrderByID(@PathVariable Long id) {
        log.debug("应用:{}根据ID:{}查询订单信息", applicationName, id);
        Order order = new Order();
        order.setId(id);
        order.setOrderTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        order.setAmount(BigDecimal.valueOf(130L));

        User user = userFeign.getUserByID(155L);
        log.info("user接口返回结果:{}", user);
        return order;
    }

}
