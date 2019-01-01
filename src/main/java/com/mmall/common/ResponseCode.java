package com.mmall.common;


public enum ResponseCode {

    SUCCESS(0, "SUCCESS"),
    ERROR(0, "ERROR"),
    NEED_LOGIN(0, "NEED_LOGIN"),
    ILLEGAL_ARGUMENT(0, "ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;

    ResponseCode(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }

    public String getDesc(){
        return desc;
    }
}
