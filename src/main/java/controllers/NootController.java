package controllers;

import handlers.noots.INootHandler;
import models.Reply;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/noots")
@Produces(MediaType.APPLICATION_JSON)
public class NootController {

    private static INootHandler handler;

    public static void setHandler(INootHandler handler) {
        NootController.handler = handler;
    }

    @Path("/sendNoot")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response sendNoot(String data) {
        System.out.println(data);
        Reply reply = handler.sendNoot(data);
        return Response.status(reply.getStatus().getCode()).entity(reply.getMessage()).build();
    }

    @Path("/getNoot")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getNoot(String data) {
        System.out.println(data);
        Reply reply = handler.getNoot(data);
        return Response.status(reply.getStatus().getCode()).entity(reply.getMessage()).build();
    }

    @Path("/getAllNoots")
    @GET
    public Response getAllNoots() {
        Reply reply = handler.getAllNoots();
        return Response.status(reply.getStatus().getCode()).entity(reply.getMessage()).build();
    }

    @Path("/getNootsTimeline")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getNootsTimeline(String data) {
        System.out.println(data);
        Reply reply = handler.getNootsTimeline(data);
        return Response.status(reply.getStatus().getCode()).entity(reply.getMessage()).build();
    }

    @Path("/getNootsFromUser")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getNootsFromUser(String data) {
        System.out.println(data);
        Reply reply = handler.getNootsFromUser(data);
        return Response.status(reply.getStatus().getCode()).entity(reply.getMessage()).build();
    }

    @Path("/deleteNoot")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteNoot(String data) {
        System.out.println(data);
        Reply reply = handler.deleteNoot(data);
        return Response.status(reply.getStatus().getCode()).entity(reply.getMessage()).build();
    }
}
