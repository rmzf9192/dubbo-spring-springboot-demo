package com.el.gmall.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.el.gmall.bean.UserAddress;
import com.el.gmall.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/2/26 14:29
 * @Version:V1.0
 * @Description:UserServiceImpl
 */
@Service//暴露服务
@Component
public class UserServiceImpl implements UserService {
    @HystrixCommand
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl.......1......");
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
      /*  try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        if(Math.random()>0.5) {
            throw new RuntimeException();
        }
        return Arrays.asList(address1,address2);
    }
}