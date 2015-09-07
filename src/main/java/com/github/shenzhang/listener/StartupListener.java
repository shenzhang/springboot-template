package com.github.shenzhang.listener;

import com.github.shenzhang.entity.User;
import com.github.shenzhang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * User: Zhang Shen
 * Date: 9/6/15
 * Time: 9:59 PM
 */
@Component
public class StartupListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        User user = new User();
        user.setName("shenzhang");
        userRepository.save(user);

        user = new User();
        user.setName("gaoying");
        userRepository.save(user);
    }
}
