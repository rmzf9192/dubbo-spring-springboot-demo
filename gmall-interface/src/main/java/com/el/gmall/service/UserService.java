package com.el.gmall.service;

import com.el.gmall.bean.UserAddress;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/2/26 9:19
 * @Version:V1.0
 * @Description:UserService
 */
public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}
