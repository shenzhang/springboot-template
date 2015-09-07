package com.github.shenzhang.service;

import com.github.shenzhang.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class TestServiceIntegrationTest {
    @Autowired
    private UserService userService;

    @Test
    public void shouldReturnTrue() throws Exception {
//        assertThat(testService.getUserCount(), is(3));
    }
}