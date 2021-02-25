package com.wind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wind
 */
@Controller
@RequestMapping(path = "/user")
public class HelloController {
    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println("hello Spring MVC");
        return "success";
    }

    @RequestMapping(value = "/testRequestMapping",params = {"username=heihei"},headers = {"Accept"})
    public String testRequestMapping() {
        System.out.println("测试RequestMapping");
        return "success";
    }
}
