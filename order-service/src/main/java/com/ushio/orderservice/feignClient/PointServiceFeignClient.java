package com.ushio.orderservice.feignClient;

import com.ushio.commonmodule.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "point-service")
public interface PointServiceFeignClient {

    @PostMapping(value = "/point/add")
    String addPoint(@RequestBody Order order);
}
