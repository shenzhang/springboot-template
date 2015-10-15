package com.github.shenzhang.configuration.h2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * User: Zhang Shen
 * Date: 9/6/15
 * Time: 10:09 PM
 */
@Configuration
@Profile("h2")
public class H2Configuration {
//    @Bean
//    ServletRegistrationBean h2servletRegistration() {
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
//        registrationBean.addUrlMappings("/h2/*");
//        return registrationBean;
//    }
}
