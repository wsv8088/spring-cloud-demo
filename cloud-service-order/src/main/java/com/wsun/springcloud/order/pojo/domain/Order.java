package main.java.com.wsun.springcloud.order.pojo.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {
    private Long id;

    private String orderTime;

    private BigDecimal amount;
}
