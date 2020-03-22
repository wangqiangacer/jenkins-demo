package com.jacken.jenkinsdemo.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/3/22 10:57
 */
@Component
@Slf4j
public class EventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {

        //这里是监听器具体执行的某个方法
        try {
            Thread.sleep(5000);
            log.info("监听到事件源：" + CustomEvent.class.getName() + customEvent.getSource());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
