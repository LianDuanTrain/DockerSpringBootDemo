package com.docker.restful.demo;


import javax.inject.Named;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.docker.restful.demo.rest.SysInfoResource;
import com.docker.restful.demo.rest.UserResource;

@Configuration
@Component
public class AppConfig {
	static	Logger log = LoggerFactory.getLogger(AppConfig.class);
    @Named
    static class JerseyConfig extends ResourceConfig {
        public JerseyConfig() {
        	try {
        	log.info("AppConfig version is V2");
            this.packages("com.docker.restful.demo.*");
            register(UserResource.class);
            register(SysInfoResource.class);
            register( EndpointVersion.class);
            property(ServletProperties.FILTER_FORWARD_ON_404, true);

            } catch (Exception e) {
            	log.error("Exception: ", e);                   
            }
        }
    }

}