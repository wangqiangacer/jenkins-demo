package com.jacken.jenkinsdemo.controller;

import com.jacken.jenkinsdemo.event.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/3/22 11:01
 */
@RestController
public class LisenterController {


    @Autowired
    ApplicationContext applicationContext;
    @RequestMapping("/publish")
    public  String publish(){
        applicationContext.publishEvent(new CustomEvent("发送邮件"));
        return  "发送成功";
    }
}
