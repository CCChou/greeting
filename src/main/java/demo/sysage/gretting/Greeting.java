package demo.sysage.gretting;

import java.time.LocalDateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greeting")
public class Greeting {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        String msg = System.getenv("MESSAGE");
        return msg + " " + LocalDateTime.now() + "\n";
    }
}