package com.wsun.springcloud.service.order.feign;

import com.wsun.springcloud.service.order.pojo.rpc.result.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "cloud-service-user", path = "/api/v1")
public interface UserFeign {
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    User getUserByID(@PathVariable(value = "id") Long id);
}
