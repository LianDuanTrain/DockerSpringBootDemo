

package com.docker.restful.demo;


import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Named
@Path("/")
public class EndpointVersion {
  

    @GET
    public String getVersion() {
        return "v1";
    }

  
 
}
