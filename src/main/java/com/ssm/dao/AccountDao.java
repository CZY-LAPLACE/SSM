package com.ssm.dao;

import org.springframework.stereotype.Repository;
import com.ssm.pojo.User;

import java.util.List;

@Repository
public interface AccountDao {
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
