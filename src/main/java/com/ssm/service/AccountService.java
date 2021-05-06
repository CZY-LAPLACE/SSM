package com.ssm.service;

import com.ssm.pojo.User;

import java.util.List;

/**
 * @author CZY
 */
public interface AccountService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAll();

    /**
     * 注册账号
     * @param user
     * @return
     */
    int accountLogin(User user);
}
