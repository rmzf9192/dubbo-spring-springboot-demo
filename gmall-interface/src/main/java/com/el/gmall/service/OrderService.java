package com.el.gmall.service;

import com.el.gmall.bean.UserAddress;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/2/26 9:37
 * @Version:V1.0
 * @Description:OrderService
 */
public interface OrderService {
    /**
     * 初始化订单
     * @param userId：用户id
     * @return
     */
    public List<UserAddress> initOrder(String userId);
}
