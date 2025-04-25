package com.ushio.pointservice.controller;

import com.ushio.commonmodule.entity.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/point")
public class PointController {

    @GetMapping(value = "/test")
    public String test(){
        return "this is point-service test";
    }

    @PostMapping(value = "/add")
    public String addPoint(@RequestBody Order order){
        return "add point success! productionName:"+order.getProductionName();
    }
}
