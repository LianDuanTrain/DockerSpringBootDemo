

package com.docker.restful.demo;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import com.docker.restful.demo.services.UserService;
@RestController
@Path("/")
public class EndpointVersion {
	Logger logger = LoggerFactory.getLogger(EndpointVersion.class);
	@Value("${app.version}")
	private String appVersion;
	@Path("/version")
    @GET
    public String getVersion() {
		logger.info("appVersion is "+appVersion);
        return appVersion;
    }

    @GET
    public String getVersionRoot() {
    	logger.info("appVersion is "+appVersion);
        return appVersion;
    }

  
 
}
