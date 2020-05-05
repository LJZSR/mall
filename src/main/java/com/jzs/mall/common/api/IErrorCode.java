package com.jzs.mall.common.api;

/**
 * 封装API的错误码
 * Created by jzs on 2020/5/5.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}