package com.xaehu.httplib;

/**
 * author : xaeHu
 * e-mail : hsfemail@qq.com
 * date   : 2019/9/19 16:17
 * desc   :
 */
public class RequestHeader {
    private String key;
    private String value;

    public RequestHeader(){}
    public RequestHeader(String key,String value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
