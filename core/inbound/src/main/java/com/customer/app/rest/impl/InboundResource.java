package com.customer.app.rest.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.stereotype.Service;

import com.customer.app.Patient;

@Service
@Path("/rest")
public class InboundResource {

    @POST
    @Path("/inbound")
    @Consumes("application/xml")
    public void postInbound(Patient person) {
    }
}
