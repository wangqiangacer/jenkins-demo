package com.jacken.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class UserController {
    @RequestMapping("/user")
    public  String getUserName(){
        return "你个傻子，以后的路还很长，希望你遇到的那个人能够真心对你好，同样能给你想要的生活，要幸福哈哈哈哈哈哈。";
    }

}
