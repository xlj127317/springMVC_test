package com.wind.controller;

import com.wind.domain.Account;
import com.wind.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wind
 */
@Controller
@RequestMapping(path = "param")
public class ParamController {
    @RequestMapping(path = "testParam")
    public String testParam(String username,String password) {
        System.out.println("执行了。。。");
        System.out.println("username = " + username + ", password = " + password);
        return "success";
    }

    /**
     * 请求参数绑定封装到javaBean的类中
     * @param account
     * @return
     */
    @RequestMapping(path = "/savaAccount")
    public String saveAccount(Account account) {
        System.out.println("account = " + account );
        return "success";
    }

    @RequestMapping(path = "/savaUser")
    public String savaUser(User user) {
        System.out.println("执行了");
        System.out.println("user = " + user);
        return "success";
    }
}
