package com.el.gmall.service;

import com.el.gmall.bean.UserAddress;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/2/26 9:46
 * @Version:V1.0
 * @Description:UserServiceStub
 */
public class UserServiceStub implements UserService {
    private final UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceStub......");
        if(!StringUtils.isEmpty(userId)){
           return userService.getUserAddressList(userId);
        }
        return null;
    }
}
