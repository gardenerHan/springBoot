package com.ifox.hgx.springboot.controller;

import com.ifox.hgx.springboot.config.MyMvcConfig;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Description:
 * @Author hanguixian
 * @Date Created in 21:37 2018/7/17
 */
@Controller
public class LoginController {

    @PostMapping(value = "login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map,
                        HttpSession session) {
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            session.setAttribute("loginUserName", username);
            return "redirect:/main.html";
        } else {
            map.put("msg","用户名密码错误") ;
            return "login" ;
        }
    }

}
