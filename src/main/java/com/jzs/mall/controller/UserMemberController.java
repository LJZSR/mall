package com.jzs.mall.controller;

import com.jzs.mall.common.api.CommonResult;
import com.jzs.mall.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 会员登陆Controller
 * Created by jzs on 2020/5/20
 */
@Controller
@Api(tags = "UserMemberController", description = "会员登陆注册管理")
@RequestMapping("/sso")
public class UserMemberController {
    @Autowired
    private UmsMemberService memberService;

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String telephone) {
        return memberService.generateAuthCode(telephone);
    }

    @ApiOperation("验证验证码")
    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult verifyAuthCode(@RequestParam String telephone, @RequestParam String autoCode) {
        return memberService.verifyAuthCode(telephone, autoCode);
    }

}
