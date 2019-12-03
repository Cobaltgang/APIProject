/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapplication;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author blras
 */
@Path("/App")
public class Bank {
@POST
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.TEXT_PLAIN)
public Response createCustomer(@FormParam("name") String name,
                             @FormParam("address") String address,
                             @FormParam("email") String email,
                             @FormParam("ssn") String ssn) {
                             String output = " "+" "+name+" "+address+" "+email+" "+ssn;
        return Response.status(200).entity(output).build();
    }

}
