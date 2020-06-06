package com.jzs.mall.service;

import com.jzs.mall.mbg.model.UmsAdmin;
import com.jzs.mall.mbg.model.UmsPermission;

import java.util.List;

/**
 * 后台管理员service
 * Created by JZS on 2020/6/6
 */
public interface UmsAdminService {

    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getUmsAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登陆功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT-token
     */
    String login(String username, String password);

    /**
     * 获取用户所以权限
     */
    List<UmsPermission> getPermissionList(Long adminId);

}
