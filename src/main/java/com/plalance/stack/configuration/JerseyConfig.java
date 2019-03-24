package com.plalance.stack.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.plalance.stack.resource.FTPResource;
import com.plalance.stack.resource.GenericResource;
 
@Component
public class JerseyConfig extends ResourceConfig
{
    public JerseyConfig()
    {
        register(GenericResource.class);
        register(FTPResource.class);
    }
}