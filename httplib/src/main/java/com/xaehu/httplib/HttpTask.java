package com.xaehu.httplib;

import com.alibaba.fastjson.JSON;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * author : xaeHu
 * e-mail : hsfemail@qq.com
 * date   : 2019/9/19 10:54
 * desc   :
 */
public class HttpTask<T> implements Runnable, Delayed {

    private IHttpRequest httpRequest;

    public HttpTask(String url, List<RequestHeader> headers, T requestData, IHttpRequest httpRequest, CallbackListener callbackListener) {
        this.httpRequest = httpRequest;
        httpRequest.setUrl(url);
        httpRequest.setListener(callbackListener);
        httpRequest.setHeader(headers);
        String content = JSON.toJSONString(requestData);
        try {
            httpRequest.setData(content.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        if(!httpRequest.execute()){
            ThreadPoolMananger.getInstance().addDelayTask(this);
        }
    }

    /*************** 重试机制 *******************/
    private int retryCount;
    private long retryTime;

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public long getRetryTime() {
        return retryTime;
    }

    public void setRetryTime(long retryTime) {
        this.retryTime = retryTime + System.currentTimeMillis();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(this.retryTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }

    public void onFail() {
        httpRequest.onFail();
    }
}
