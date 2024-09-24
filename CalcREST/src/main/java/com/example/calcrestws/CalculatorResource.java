package com.example.calcrestws;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/calculator")
public class CalculatorResource {

    // GET request for addition
    @GET
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public Response add(@QueryParam("a") double a, @QueryParam("b") double b) {
        double result = a + b;
        return Response.ok("{\"result\":" + result + "}").build();
    }

    // POST request for addition
    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addNumbers(CalculatorInput input) {
        double a = input.getA();
        double b = input.getB();
        double result = a + b;
        return Response.ok("{\"result\":" + result + "}").build();
    }
}
