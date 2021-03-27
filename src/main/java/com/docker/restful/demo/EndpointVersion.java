

package com.docker.restful.demo;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class EndpointVersion {
  
	@Path("/version")
    @GET
    public String getVersion() {
        return "v1";
    }

    @GET
    public String getVersionRoot() {
        return "v1";
    }

  
 
}
