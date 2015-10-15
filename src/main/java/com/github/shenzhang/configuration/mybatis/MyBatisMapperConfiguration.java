package com.github.shenzhang.configuration.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * User: Zhang Shen
 * Date: 9/10/15
 * Time: 9:40 PM
 */
@Configuration
public class MyBatisMapperConfiguration {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

//    @Bean
//    public MapperFactoryBean<UserMapper> userMapper() {
//        MapperFactoryBean<UserMapper> bean = new MapperFactoryBean<>(UserMapper.class);
//        bean.setSqlSessionFactory(sqlSessionFactory);
//        return bean;
//    }

    @Bean
    public MapperScannerConfigurer mapperScanner() {
        MapperScannerConfigurer scanner = new MapperScannerConfigurer();
        scanner.setSqlSessionFactoryBeanName("sqlSessionFactory");
        scanner.setBasePackage("com.github.shenzhang.dao.mybatis");
        return scanner;
    }
}
