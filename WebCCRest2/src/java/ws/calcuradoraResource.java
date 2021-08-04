/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author rodri
 */

@Path("calculadora")
public class calcuradoraResource {


    @Context
    private UriInfo context;

    /**
     * Creates a new instance of calcuradoraResource
     */
    public calcuradoraResource() {
    }

    /**
     * Retrieves representation of an instance of ws.calcuradoraResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("/soma/{valor1},{valor2}")
    public int getSoma(@PathParam("valor1") int valor1, @PathParam("valor2") int valor2) {
        //TODO return proper representation object
        return valor1 + valor2; 
    }

    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("/subtracao/{valor1},{valor2}")
    public int getSubtracao(@PathParam("valor1") int valor1, @PathParam("valor2") int valor2) {
        //TODO return proper representation object
        return valor1 - valor2; 
    }
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("/divisao/{valor1},{valor2}")
    public int getDivisao(@PathParam("valor1") int valor1, @PathParam("valor2") int valor2) {
        //TODO return proper representation object
        return valor1 / valor2; 
    }
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("/multiplicacao/{valor1},{valor2}")
    public int getMultiplicacao(@PathParam("valor1") int valor1, @PathParam("valor2") int valor2) {
        //TODO return proper representation object
        return valor1 * valor2; 
    }    
    
    /**
     * PUT method for updating or creating an instance of calcuradoraResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void putXml(String content) {
    }
}

