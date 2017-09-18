package io.acari;


import org.jboss.resteasy.annotations.cache.NoCache;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.time.Instant;

@Path("api")
public class ApiModule {

    @GET
    @NoCache
    @Produces("application/json")
    public String getMessage(){
        return "@ " + Instant.now() + " Vagrant is AWESOME!\n";
    }
}
