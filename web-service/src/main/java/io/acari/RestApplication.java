package io.acari;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.Instant;

@ApplicationPath("")
public class RestApplication {

    @Path("")
    @GET
    public String getMessage(){
        return "@ " + Instant.now() + " Vagrant is AWESOME!\n";
    }
}
