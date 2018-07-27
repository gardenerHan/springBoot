package com.ifox.hgx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Description:
 * @Author hanguixian
 * @Date Created in 18:09 2018/7/14
 */

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){

        map.put("hello","<h1>你好<h1>") ;
        return "success" ;
    }
}
