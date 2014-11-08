package com.github.shenzhang.controller;

import com.github.shenzhang.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: shenzhang
 * Date: 11/5/14
 * Time: 11:27 PM
 */
@RestController
public class JsonController {
    @Value("${message}")
    private String message;
    @Value("${name}")
    private String name;
    @Autowired
    private TestService testService;

    @RequestMapping("/jdbc")
    public int jdbc() {
        return testService.getUserCount();
    }
}