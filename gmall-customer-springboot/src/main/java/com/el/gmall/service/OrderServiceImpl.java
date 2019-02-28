package com.el.gmall.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.el.gmall.bean.UserAddress;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/2/26 14:41
 * @Version:V1.0
 * @Description:OrderServiceImpl
 *
 * 1、将服务提供者注册到注册中心（暴露服务）
 * 		1）、导入dubbo依赖（2.6.2）\操作zookeeper的客户端(curator)
 * 		2）、配置服务提供者
 *
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 */
public class OrderServiceImpl implements OrderService {
    //@Reference(loadbalance="random",timeout=1000) //dubbo直连
    @Reference
    private UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("查询用户的id："+userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }

    public List<UserAddress> hello(String userId) {
        return Arrays.asList(new UserAddress(10, "测试地址", "1", "测试", "测试", "Y"));
    }
}
