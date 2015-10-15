package com.github.shenzhang.dao.mybatis;

import com.github.shenzhang.Application;
import com.github.shenzhang.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * User: Zhang Shen
 * Date: 9/29/15
 * Time: 4:13 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {
        Application.class
})
@Transactional
public class UserMapperIntgTest {
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Autowired
    private ApplicationContext context;

    @Test
    public void shouldGetUser() throws Exception {
        User user = userMapper.getUserByName("shenzhang");
        assertNotNull(user);
        assertThat(user.getAge(), is(31));
    }

    @Test
    public void shouldListAllUsers() throws Exception {
        List<User> users = userMapper.getUsers();
        assertThat(users.size(), is(2));
    }

    @Test
    public void testListUsersByAge() throws Exception {
        List<User> users = userMapper.getUsersByAge(31);
        assertThat(users.size(), is(1));
    }
}