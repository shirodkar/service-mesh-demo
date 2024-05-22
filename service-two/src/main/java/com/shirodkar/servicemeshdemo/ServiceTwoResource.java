package com.shirodkar.servicemeshdemo;

import io.quarkus.logging.Log;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("")
public class ServiceTwoResource {

    @GET
    @Path("handle/{value}")
    @Produces(MediaType.TEXT_PLAIN)
    public String handleServiceTwo(@PathParam("value") String value) throws Exception {
        Log.debug("Value = " + value);
        Thread.sleep(10000);
        return value;
    }
}
