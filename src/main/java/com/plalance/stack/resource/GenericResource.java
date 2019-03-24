package com.plalance.stack.resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/")
public class GenericResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response genericResponse() throws IOException {
		String content = new String(Files.readAllBytes(Paths.get("C:\\\\audio.log")));
		return Response.status(Status.OK).entity(content).build();
	}
	
	@GET
	@Path("/d")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public Response downloadResponse() throws IOException {
		
//		File file = new File("C:"+File.separator+File.separator+"audio.log");
		File file = new File("D:\\\\Vidéos\\Test Surround\\test.mkv");
		FileInputStream strem = new FileInputStream(file);
		
		return Response
				.status(Status.OK)
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename = test.mkv")
				.entity(strem).build();
	}
}
