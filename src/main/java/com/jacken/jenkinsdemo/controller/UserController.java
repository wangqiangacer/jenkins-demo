package com.jacken.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class UserController {
    @RequestMapping("/user")
    public  String getUserName() {
        int i=1/0;
        System.out.println(i);
        return "哈哈哈这是测试  可以可以";
    }

    @RequestMapping("/index")
    public  String index(){
        return  "index .....";
    }
}
