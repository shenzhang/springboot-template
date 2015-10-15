package com.github.shenzhang.controller;

import com.github.shenzhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: shenzhang
 * Date: 11/5/14
 * Time: 11:27 PM
 */
@RestController
@RequestMapping("/jpa")
public class JpaController {
    @Autowired
    private UserService userService;

    @RequestMapping("/count")
    public long count() {
        return userService.getUserCount();
    }
}
