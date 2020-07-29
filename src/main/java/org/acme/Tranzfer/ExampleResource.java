package main.java.org.acme.Tranzfer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/mis-datos")
@Produces(MediaType.APPLICATION_JSON)
public class ExampleResource {
    Persona a1 = new Persona("Alex","Vasquez",15,"Lima","Javier Prado Este","2965");

    @GET
    public Persona Soyyo() {
        return this.a1;
    }
}