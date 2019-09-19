package com.xaehu.httplib;

/**
 * author : xaeHu
 * e-mail : hsfemail@qq.com
 * date   : 2019/9/19 10:28
 * desc   :
 */
public interface ResponseListener<T> {

    void onSuccess(T t);

    void onFail();

}
