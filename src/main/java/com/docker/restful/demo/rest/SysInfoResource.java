package com.docker.restful.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.docker.restful.demo.entities.SysInfo;
import com.docker.restful.demo.services.SysInfoService;


@Path("/sys")
public class SysInfoResource {
	Logger log = LoggerFactory.getLogger(SysInfoResource.class);
	@Autowired
	private SysInfoService sysInfoService;

	   
    @GET
    @Produces("application/json")
    @CrossOrigin
    public Response getInfo() {
    	log.info("getInfo start");
    	SysInfo sysInfo  = sysInfoService.getSysInfo();
    	log.info("getInfo end");
		return Response.status(200).entity(sysInfo).build();
	}

}
