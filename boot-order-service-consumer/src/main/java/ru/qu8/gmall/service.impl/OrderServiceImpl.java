package ru.qu8.gmall.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import ru.qu8.gmall.bean.UserAddress;
import ru.qu8.gmall.service.OrderService;
import ru.qu8.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    //@Autowired
    @DubboReference
    UserService userService;
    @HystrixCommand(fallbackMethod = "hi")
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户ID:"+userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }

    public List<UserAddress> hi(String userId){
        return Arrays.asList(new UserAddress(10, "测试地址", "1", "测试", "测试", "Y"));
    }
}
