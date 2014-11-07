package com.github.shenzhang.service;

import com.github.shenzhang.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: shenzhang
 * Date: 11/7/14
 * Time: 4:25 PM
 */
@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    public int getUserCount() {
        return testDao.getUserCount();
    }
}
