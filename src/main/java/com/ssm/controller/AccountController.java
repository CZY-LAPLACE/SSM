package com.ssm.controller;

import com.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ssm.service.AccountService;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "accountController")
public class AccountController {

    @Autowired
    private AccountService accountService;
    @RequestMapping(value = "selectAll")
    public String selectAll(Map map){
        List<User> users = accountService.selectAll();
        map.put("users",users);
        return "list";
    }

    @RequestMapping("accountLogin")
    public int accountLogin(User user){
        return accountService.accountLogin(user);
    }
}
