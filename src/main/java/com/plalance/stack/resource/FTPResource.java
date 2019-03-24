package com.plalance.stack.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import com.plalance.stack.service.FTPService;

@Path("/ftp")
public class FTPResource{

	@Autowired
	private Environment env;
	
	@Inject
	FTPService ftpService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response list() {
		List<String> list = ftpService.getFilesList();
		return Response.status(Status.OK).entity(list).build();
	}

	@GET
	@Path("/configuration")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getConfig() {
		
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("user", env.getProperty("ftp.user"));
		map.put("password", env.getProperty("ftp.password"));
		map.put("host", env.getProperty("ftp.host"));
		
		return Response.status(Status.OK).entity(map).build();
	}
}
