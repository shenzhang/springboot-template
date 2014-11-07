package com.github.shenzhang.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * User: shenzhang
 * Date: 11/7/14
 * Time: 2:37 PM
 */
@Repository
public class TestDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getUserCount() {
        return jdbcTemplate.queryForInt("select count(*) from t_user");
    }
}
