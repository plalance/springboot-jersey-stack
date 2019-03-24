package com.plalance.stack.configuration;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
 
@Component
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig
{
    public JerseyConfig()
    {
    	packages("com.plalance.stack.resource");
//        register(GenericResource.class);
//        register(FTPResource.class);
    }
}