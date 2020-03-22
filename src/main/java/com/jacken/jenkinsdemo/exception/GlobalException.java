package com.jacken.jenkinsdemo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/3/22 15:35
 */
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public Map exceptionHandler(Exception e){
        System.out.println("未知异常！原因是:"+e);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("code",500);
        map.put("message","系统异常，请稍后重试");
        return map;
    }
}
