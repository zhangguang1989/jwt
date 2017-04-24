package com.zg.vo;

import java.io.Serializable;

public class ResponseResult implements Serializable {

    private String code;
    private String msg;
    private Object data;

    public ResponseResult(String msg) {
        this.code = "1";
        this.msg = msg;
    }

    public ResponseResult(Object data) {
        this.code = "0";
        this.msg = "操作成功";
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
