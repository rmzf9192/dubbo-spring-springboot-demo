package com.el.gmall;

import com.el.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService orderService = applicationContext.getBean(OrderService.class);

        orderService.initOrder("");
        System.out.println("调用完成....");
        System.in.read();
    }
}
