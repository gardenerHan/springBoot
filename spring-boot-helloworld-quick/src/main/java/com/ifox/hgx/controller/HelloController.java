package com.ifox.hgx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hanguixian
 * @Date Created in 17:24 2018/7/3
 */
@RestController
public class HelloController {


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world" ;
    }
}
