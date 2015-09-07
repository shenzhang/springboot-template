package com.github.shenzhang.repository;

import com.github.shenzhang.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * User: Zhang Shen
 * Date: 8/31/15
 * Time: 6:53 PM
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
