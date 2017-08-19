package com.github.shenzhang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * User: shenzhang
 * Date: 3/27/14
 * Time: 2:13 PM
 */

@EnableWebSecurity
@SpringBootApplication
public class Application {
    @Autowired
    private Environment environment;

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
    }
}
