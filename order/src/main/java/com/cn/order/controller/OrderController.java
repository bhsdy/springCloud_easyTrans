package com.cn.order.controller;

import com.cn.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/buySth")
    @ResponseBody
    public Integer buySomething(@RequestParam int userId, @RequestParam int money){
        return orderService.buySomething(userId, money);
    }
}
