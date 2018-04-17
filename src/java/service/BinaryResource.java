package service;

import entities.Binary;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Stateless
@Path("/product")

public class BinaryResource {
    static Binary binary;
    
    @GET
    @Produces({"application/json", "application/xml"})
    public Binary leer(){
        return binary;
    }
    
    @POST
    @Consumes({"application/xml", "application/json"})
    public Response guardar(Binary b){
        binary = b;
        return Response.ok(b).build();
    }
}

