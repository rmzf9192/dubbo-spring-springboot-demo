package com.el.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.el.gmall.bean.UserAddress;
import com.el.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/2/26 11:05
 * @Version:V1.0
 * @Description:OrederController
 */
@Controller
public class OrederController {
   // @Reference
    @Autowired
    private OrderService orderService;


    public List<UserAddress> initOrder(String userId) {
      return   orderService.initOrder(userId);
    }

}
