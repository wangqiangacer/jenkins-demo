package com.jacken.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class UserController {
    @RequestMapping("/user")
    public  String getUserName() {
        return "龚玲 我爱你";
    }
}
