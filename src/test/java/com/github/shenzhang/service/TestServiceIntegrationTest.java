package com.github.shenzhang.service;

import com.github.shenzhang.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class TestServiceIntegrationTest {
    @Autowired
    private TestService testService;

    @Test
    public void shouldReturnTrue() throws Exception {
        assertThat(testService.getUserCount(), is(3));
    }
}