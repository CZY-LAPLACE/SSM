package com.ssm.service.impl;


import com.ssm.dao.AccountDao;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssm.pojo.User;

import java.util.Date;
import java.util.List;

/**
 * @author CZY
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<User> selectAll(){
        return accountDao.selectAll();
    }

    /**
     * 注册账号
     *
     * @param user
     * @return
     */
    @Override
    public int accountLogin(User user) {
        return accountDao.accountLogin(user);
    }
}
