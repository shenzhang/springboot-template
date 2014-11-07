package com.github.shenzhang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * User: shenzhang
 * Date: 3/27/14
 * Time: 2:13 PM
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
    @Autowired
    private Environment environment;

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
    }
}
