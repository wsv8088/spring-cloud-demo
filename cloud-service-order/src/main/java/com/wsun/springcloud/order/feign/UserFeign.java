package main.java.com.wsun.springcloud.order.feign;

import main.java.com.wsun.springcloud.order.pojo.rpc.result.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "cloud-service-user", path = "/api")
public interface UserFeign {
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    User getUserByID(@PathVariable(value = "id") Long id);
}
