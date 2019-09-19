package com.xaehu.httplib;

import android.os.Handler;
import android.os.Looper;

import com.alibaba.fastjson.JSON;

import org.json.JSONStringer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * author : xaeHu
 * e-mail : hsfemail@qq.com
 * date   : 2019/9/18 12:25
 * desc   :
 */
public class JsonCallbackListener<T> implements CallbackListener {

    private Class<T> responseClass;
    private Handler handler = new Handler(Looper.getMainLooper());
    private ResponseListener<T> responseListener;

    public JsonCallbackListener(Class<T> responseClass,ResponseListener<T> responseListener) {
        this.responseClass = responseClass;
        this.responseListener = responseListener;
    }

    @Override
    public void onSuccess(InputStream is) {
        // 将流转换成指定responseClass
        String response = getContent(is);
        // 将json转为T对象
        final T clazz = JSON.parseObject(response,responseClass);
        handler.post(new Runnable() {
            @Override
            public void run() {
                responseListener.onSuccess(clazz);
            }
        });
    }

    private String getContent(InputStream is) {
        String content = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            content = sb.toString();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return content;
    }

    @Override
    public void onFail() {
        handler.post(new Runnable() {
            @Override
            public void run() {
                responseListener.onFail();
            }
        });
    }
}
