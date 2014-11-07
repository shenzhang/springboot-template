package com.github.shenzhang.configuration;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Configuration;

/**
 * User: shenzhang
 * Date: 11/7/14
 * Time: 2:11 PM
 */
@Configuration
public class ContainerConfiguration implements EmbeddedServletContainerCustomizer {
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8080);
    }

    /**
     * deep customize embedded web containner.
     * could change tomcat to jetty here
    @Bean
    public EmbeddedServletContainerFactory servletContainer() { TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory(); factory.setPort(9000);
        factory.setSessionTimeout(10, TimeUnit.MINUTES);
        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/notfound.html"));
        return factory;
    }
    */
}
