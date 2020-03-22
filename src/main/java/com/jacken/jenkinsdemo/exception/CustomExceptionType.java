package com.jacken.jenkinsdemo.exception;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/3/22 15:07
 */
public enum CustomExceptionType {
    USER_INPUT_ERROR(400,"用户输入异常"),
    system_error(500,"系统错误");

    CustomExceptionType(int code, String typeDesc) {
    this.code=code;
    this.typeDesc=typeDesc;
    }

    private  int code;
    private  String typeDesc;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }
}
