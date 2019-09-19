package com.xaehu.httplib;

import java.util.List;

/**
 * author : xaeHu
 * e-mail : hsfemail@qq.com
 * date   : 2019/9/18 12:03
 * desc   :
 */
public interface IHttpRequest {

    void setUrl(String url);

    void setData(byte[] data);

    void setListener(CallbackListener callbackListener);

    void setHeader(List<RequestHeader> headers);

    void onFail();

    boolean execute();
}
