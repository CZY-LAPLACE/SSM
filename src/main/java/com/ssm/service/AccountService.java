package com.ssm.service;

import com.ssm.pojo.User;

import java.util.List;

public interface AccountService {
    List<User> selectAll();
}
