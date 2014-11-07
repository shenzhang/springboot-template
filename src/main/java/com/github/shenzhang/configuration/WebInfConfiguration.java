package com.github.shenzhang.configuration;

import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * User: shenzhang
 * Date: 11/7/14
 * Time: 1:57 PM
 */
@Configuration
public class WebInfConfiguration implements ServletContextInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
    }

    /*
    @Bean
    public FilterRegistrationBean authenticationFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        // configure bean ...
        return bean;
    }

    @Bean
    public ServletRegistrationBean defaultServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean();
        // configure bean ...
        return bean;
    }
    */
}
