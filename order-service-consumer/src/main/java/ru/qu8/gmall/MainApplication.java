package ru.qu8.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.qu8.gmall.service.OrderService;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = ioc.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("调用结束");

        System.in.read();
    }
}
