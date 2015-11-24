package com.kpos.api.resource;

import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by kameldabwan on 11/22/15.
 */
@Component
@Path("/test")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_PLAIN)
public class Test {

    @GET
    public Response test(){
        return Response.ok("test").build();
    }
}
