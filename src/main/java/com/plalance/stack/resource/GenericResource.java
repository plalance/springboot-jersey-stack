package com.plalance.stack.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/stack")
public class GenericResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response genericReponse() {
		return Response.status(Status.OK).entity("OK").build();
	}
}
