package com.jacken.jenkinsdemo.exception;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/3/22 15:24
 */
public class CustomException  extends  RuntimeException{
    private  int code;
    private  String message;
    public  CustomException(CustomExceptionType exceptionType,String message){
        this.code=exceptionType.getCode();
        this.message=message;
    }
    int code(){
        return  code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
