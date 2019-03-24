package com.plalance.stack.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.plalance.stack.service.FTPService;

@Path("/ftp")
public class FTPResource{

	@Inject
	FTPService ftpService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response list() {
		boolean response = false;
		response = ftpService.getList();
		return Response.status(Status.OK).entity("FTP RESOURCE Getlist implementation : "+ response).build();
	}
}
