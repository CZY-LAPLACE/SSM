package com.ssm.dao;

import org.springframework.stereotype.Repository;
import com.ssm.pojo.User;

import java.util.List;

@Repository
public interface AccountDao {
    List<User> selectAll();
}
