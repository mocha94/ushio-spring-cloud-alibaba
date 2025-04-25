package com.ushio.orderservice.controller;


import com.ushio.commonmodule.entity.Order;
import com.ushio.orderservice.feignClient.PointServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
@RefreshScope
public class OrderController {

    @Autowired
    private PointServiceFeignClient pointServiceFeignClient;

    @GetMapping(value = "/test")
    public String test(){
        return "this is order test";
    }

    @PostMapping(value = "/add")
    public String addOrder(){
        Order order = new Order();
        order.setId("123");
        order.setProductionName("水杯");
        String res = pointServiceFeignClient.addPoint(order);
        return res;
    }
}
