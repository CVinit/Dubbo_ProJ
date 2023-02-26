package ru.qu8.gmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.qu8.gmall.bean.UserAddress;
import ru.qu8.gmall.service.OrderService;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
    @ResponseBody
    @RequestMapping("initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId){
        return orderService.initOrder(userId);
    }
}
