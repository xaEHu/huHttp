package com.xaehu.httplib;

import java.util.List;

/**
 * author : xaeHu
 * e-mail : hsfemail@qq.com
 * date   : 2019/9/19 11:00
 * desc   :
 */
public class HuHttp {

    public static <T, M> void sendJsonRequest(String url, List<RequestHeader> headers, T requestData, Class<M> response, ResponseListener<M> listener) {
        IHttpRequest httpRequest = new JsonHttpRequest();
        CallbackListener callbackListener = new JsonCallbackListener<>(response, listener);
        HttpTask<T> httpTask = new HttpTask<>(url, headers,requestData, httpRequest, callbackListener);
        ThreadPoolMananger.getInstance().addTask(httpTask);
    }
}
