package com.github.shenzhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * User: Zhang Shen
 * Date: 9/10/15
 * Time: 10:11 PM
 */
@RestController
public class MyBatisController {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private PlatformTransactionManager transactionManager;

    @RequestMapping("/mybatis/ds")
    public String ds() {
        return dataSource.getClass().getName();
    }

    @RequestMapping("/mybatis/tx")
    public String tx() {
        return transactionManager.getClass().getName();
    }
}
