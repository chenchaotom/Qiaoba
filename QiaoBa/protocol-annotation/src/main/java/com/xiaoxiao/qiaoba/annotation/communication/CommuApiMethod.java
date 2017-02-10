package com.xiaoxiao.qiaoba.annotation.communication;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wangfei on 2016/12/6.
 */

/**
 * 仅仅是为了防止其对应的方法不被混淆
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface CommuApiMethod {
}
