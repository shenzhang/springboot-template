package com.shenzhang.springboot.controller;

import com.shenzhang.springboot.domain.User;
import com.shenzhang.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: Zhang Shen
 * Date: 2/8/17
 * Time: 3:31 PM.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users1")
    public List<User> getUsers1() {
        return userService.getUsers();
    }
}
