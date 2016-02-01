package com.coolweather.app.util;

/**
 * Created by hp on 2016/2/1.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
