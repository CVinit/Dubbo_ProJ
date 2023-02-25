package ru.qu8.gmall.service.impl;

import org.springframework.util.StringUtils;
import ru.qu8.gmall.bean.UserAddress;
import ru.qu8.gmall.service.UserService;

import java.util.List;

public class UserServiceStub implements UserService {
    private final UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // TODO Auto-generated method stub
        System.out.println("UserServiceStub.....");
        if(!StringUtils.isEmpty(userId)) {
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
