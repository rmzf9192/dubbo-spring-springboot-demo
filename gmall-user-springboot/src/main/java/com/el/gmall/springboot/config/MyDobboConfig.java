package com.el.gmall.springboot.config;

import com.alibaba.dubbo.config.*;
import com.el.gmall.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/2/26 15:47
 * @Version:V1.0
 * @Description:MyDobboConfig
 */
@Configuration
public class MyDobboConfig {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig("boot-user-service-provider");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20882);
        return protocolConfig;
    }

    /**
     *<dubbo:service interface="com.atguigu.gmall.service.UserService"
     ref="userServiceImpl01" timeout="1000" version="1.0.0">
     <dubbo:method name="getUserAddressList" timeout="1000"></dubbo:method>
     </dubbo:service>
     */
    @Bean
    public ServiceConfig<UserService> userServiceServiceConfig(UserService userService){
        ServiceConfig<UserService> userServiceServiceConfig = new ServiceConfig<>();
        userServiceServiceConfig.setInterface(UserService.class);
        userServiceServiceConfig.setRef(userService);
        userServiceServiceConfig.setVersion("1.0.0");
        //配置每一个method
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUserAddressList");
        methodConfig.setTimeout(1000);

        //将method的设置关联到service配置中
        List<MethodConfig> list= new ArrayList<>();
        list.add(methodConfig);
        userServiceServiceConfig.setMethods(list);

        return userServiceServiceConfig;
    }
}
