package com.ifox.hgx.config;

import com.ifox.hgx.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: ${Description}
 * @Author hanguixian
 * @Date Created in 17:56 2018/7/3
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService02(){
        System.out.println("配置类@Bean给容器中添加组件了...");
        return new HelloService() ;
    }
}
