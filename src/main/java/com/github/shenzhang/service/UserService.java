package com.github.shenzhang.service;

import com.github.shenzhang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: shenzhang
 * Date: 11/7/14
 * Time: 4:25 PM
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public long getUserCount() {
        return userRepository.count();
    }
}
