package com.example.calcrestws;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/calculator")
public class CalculatorResource {

    // Class-level variables to store posted data
    private static double storedA = 0;
    private static double storedB = 0;

    // POST request to store the numbers
    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addNumbers(CalculatorInput input) {
        storedA = input.getA();
        storedB = input.getB();

        // Respond with confirmation of stored data
        return Response.ok("{\"status\":\"Data stored successfully\", \"a\":" + storedA + ", \"b\":" + storedB + "}").build();
    }

    // GET request to add the stored numbers and return the result
    @GET
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public Response add() {
        double result = storedA + storedB;

        // Respond with the addition result
        return Response.ok("{\"result\":" + result + "}").build();
    }
}
