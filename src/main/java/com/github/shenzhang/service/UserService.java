package com.github.shenzhang.service;

import com.github.shenzhang.annotation.PerformanceLog;
import com.github.shenzhang.domain.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * User: shenzhang
 * Date: 11/7/14
 * Time: 4:25 PM
 */
@Service
public class UserService {
    @PerformanceLog
    public List<User> getUsers() {
        return Arrays.asList(generateRandomUser());
    }

    @PerformanceLog
    public User generateRandomUser() {
        User user = new User();
        user.setId(new Random().nextInt());
        user.setName("fish");
        user.setAge(32);
        return user;
    }
}
