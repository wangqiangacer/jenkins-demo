package com.jacken.jenkinsdemo.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/3/22 10:55
 */


public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }


    public  void  sendMessage(String message){
        System.out.println("发送短信内容"+message);
    }
}
