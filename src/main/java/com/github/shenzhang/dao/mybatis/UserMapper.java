package com.github.shenzhang.dao.mybatis;

import com.github.shenzhang.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * User: Zhang Shen
 * Date: 9/28/15
 * Time: 5:41 PM
 */
public interface UserMapper {
    @Select("SELECT * FROM t_user WHERE name = #{name}")
    User getUserByName(@Param("name") String name);

    @Select("SELECT * FROM t_user")
    List<User> getUsers();

    List<User> getUsersByAge(int age);
}
