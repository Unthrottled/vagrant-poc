package io.acari;


import org.jboss.resteasy.annotations.cache.NoCache;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.time.Instant;
import java.util.Random;

@Path("api")
public class ApiModule {
    private static final Random ranbo = new Random(9001L);

    @GET
    @NoCache
    @Produces("application/json")
    public String getMessage(){
        return " Docker is " + getNoun() + "!\n";
    }

    private String getNoun() {
        int i = ranbo.nextInt(1000);
        if(i > 0 && i < 100){
            return "Awesome Sauce";
        }

        else if(i > 100 && i < 200){
            return "Totes Amaze";
        }

        else if(i > 200 && i < 300){
            return "Cray-Cray Adorbs";
        }

        else if(i > 300 && i < 400){
            return "the Bees Knees";
        }

        else if(i > 400 && i < 500){
            return "da Bomb";
        }

        else {
            return "Awesome Opossum";

        }
    }
}
