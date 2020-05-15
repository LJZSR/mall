package com.jzs.mall.service;

import com.jzs.mall.common.api.CommonResult;

/**
 * 会员管理Service
 * Created by jzs on 2020/5/15
 */
public interface UmsMemberService {

    CommonResult generateAuthCode(String telephone);

    CommonResult verifyAuthCode(String telephone, String authCode);
}
