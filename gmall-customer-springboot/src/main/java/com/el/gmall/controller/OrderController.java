package com.el.gmall.controller;

import com.el.gmall.bean.UserAddress;
import com.el.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/2/26 14:45
 * @Version:V1.0
 * @Description:OrderController
 */
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId){
        return orderService.initOrder(userId);
    }
}
