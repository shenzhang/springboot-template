package com.github.shenzhang.service;

import com.github.shenzhang.annotation.PerformanceLog;
import com.github.shenzhang.domain.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * User: shenzhang
 * Date: 11/7/14
 * Time: 4:25 PM
 */
@Service
public class UserService {
    @PerformanceLog
    public List<User> getUsers() {
        User user = new User();
        user.setId(1);
        user.setName("fish");
        user.setAge(32);

        return Arrays.asList(user);
    }
}
