package controllers;
import models.Message;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.Status.*;


@Path("/ping")
@Produces(MediaType.APPLICATION_JSON)
public class PingController {

    @GET
    public Response ping() {
        Message m = new Message();
        m.entries.add("Pong");
        return Response.status(OK).entity("Pong").build();
    }
}
