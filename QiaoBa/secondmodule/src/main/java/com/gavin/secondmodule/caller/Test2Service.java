package com.gavin.secondmodule.caller;

import android.content.Context;

import com.xiaoxiao.qiaoba.annotation.communication.CallbackParam;
import com.xiaoxiao.qiaoba.annotation.communication.Caller;
import com.xiaoxiao.qiaoba.annotation.communication.CommuApiMethod;

/**
 * Created by wangfei on 2017/1/13.
 */

@Caller("test")
public interface Test2Service {
    @CommuApiMethod
    void doService(Context context, String str,  TestCallback callback);
}
