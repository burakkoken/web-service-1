package com.codnect.rest;

import com.codnect.model.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Burak Köken on 11.7.2017.
 */
@Path("/hello")
public class HelloWorldService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("hello/{param}")
    public Response getMsg(@PathParam("param") String msg){
        String output = "Jersey say : " + msg;
        return Response.status(200).entity(output).build();
    }

}
