package com.wind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "anno")
public class AnnoController {
    @RequestMapping(path = "testRequestParam")
    public String testRequestParam(@RequestParam(name="username") String username) {
        System.out.println("执行了。。。");
        return "success";
    }
}
