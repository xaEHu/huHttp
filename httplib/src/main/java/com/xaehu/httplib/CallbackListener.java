package com.xaehu.httplib;

import java.io.InputStream;

/**
 * author : xaeHu
 * e-mail : hsfemail@qq.com
 * date   : 2019/9/18 12:04
 * desc   :
 */
public interface CallbackListener {

    void onSuccess(InputStream is);

    void onFail();

}
