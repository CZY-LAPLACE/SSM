package com.ssm.service.impl;


import com.ssm.dao.AccountDao;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssm.pojo.User;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<User> selectAll(){
        return accountDao.selectAll();
    }
}
