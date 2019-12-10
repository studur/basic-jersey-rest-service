package com.telagene;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDateTime;

@Path("home")
public class RestService {


    @GET
    @Path("status")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getStatus() {

        String output = "Running as of " + LocalDateTime.now();

        return Response.status(200).entity(output).build();

    }

}
