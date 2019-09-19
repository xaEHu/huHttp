package com.xaehu.httplib;

import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * author : xaeHu
 * e-mail : hsfemail@qq.com
 * date   : 2019/9/18 12:06
 * desc   :
 */
public class JsonHttpRequest implements IHttpRequest {

    private String url;
    private byte[] data;
    private CallbackListener callbackListener;
    private HttpURLConnection urlConnection;
    private List<RequestHeader> headers;

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public void setHeader(List<RequestHeader> headers) {
        this.headers = headers;
    }

    @Override
    public void setListener(CallbackListener callbackListener) {
        this.callbackListener = callbackListener;
    }

    @Override
    public void onFail() {
        if (urlConnection != null) {
            urlConnection.disconnect();
        }
        callbackListener.onFail();
    }

    @Override
    public boolean execute() {
        //访问网络的具体操作
        URL url;
        try {
            url = new URL(this.url);
            //打开http连接
            urlConnection = (HttpURLConnection) url.openConnection();
            //连接超时时间
            urlConnection.setConnectTimeout(6000);
            //不使用缓存
            urlConnection.setUseCaches(false);
            //这个连接是否可以被重定向
            urlConnection.setInstanceFollowRedirects(true);
            //响应的超时时间
            urlConnection.setReadTimeout(3000);
            //设置这个连接是否可以写入数据
            urlConnection.setDoInput(true);
            //设置这个连接是否可以输出数据
            urlConnection.setDoOutput(true);
            //设置请求方式
            urlConnection.setRequestMethod("POST");
            //设置消息的类型
            urlConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            //设置请求头
            if (headers != null && headers.size() != 0) {
                for (RequestHeader header : headers){
                    urlConnection.setRequestProperty(header.getKey(), header.getValue());
                }
            }
            //连接
            urlConnection.connect();
            //---------- 使用字节流发送数据 -------------
            OutputStream out = urlConnection.getOutputStream();
            //缓冲字节流包装字节流
            BufferedOutputStream bos = new BufferedOutputStream(out);
            //把这个字节数组的数据写入缓冲区中
            bos.write(data);
            //刷新缓冲区，发送数据
            bos.flush();
            out.close();
            bos.close();
            //----------- 字符流写入数据 ---------------
            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                //得到服务端返回码是连接成功
                InputStream in = urlConnection.getInputStream();
                callbackListener.onSuccess(in);
            } else {
                //请求失败
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            //请求失败
            return false;
        } finally {
            urlConnection.disconnect();
        }
        return true;
    }
}
