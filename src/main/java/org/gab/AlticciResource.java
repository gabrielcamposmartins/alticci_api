package org.gab;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alticci")
public class AlticciResource {
    @Inject
    AlticciService service;

    @GET
    @Path("/{number}")
    @Produces(MediaType.TEXT_PLAIN)
    public Integer hello(@PathParam("number") Integer number) {
        return service.Calc(number);
    }
}