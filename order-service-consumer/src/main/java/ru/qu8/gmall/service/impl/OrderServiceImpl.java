package ru.qu8.gmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.qu8.gmall.bean.UserAddress;
import ru.qu8.gmall.service.OrderService;
import ru.qu8.gmall.service.UserService;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户ID:"+userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : userAddressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return userAddressList;
    }
}
