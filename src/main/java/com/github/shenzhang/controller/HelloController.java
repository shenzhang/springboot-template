package com.github.shenzhang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: shenzhang
 * Date: 11/5/14
 * Time: 11:27 PM
 */
@RestController
public class HelloController {
    @Value("${message}")
    private String message;

    @Value("${name}")
    private String name;

    @RequestMapping("/")
    String home() {
        return message + " " + name;
    }
}
