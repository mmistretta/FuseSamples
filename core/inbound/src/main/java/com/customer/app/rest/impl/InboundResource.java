package com.customer.app.rest.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Path("/rest")
public class InboundResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(InboundResource.class);

    @GET
    @Path("/inbound")
    public Response postInbound() {
        LOGGER.info("wtf?");
        // TODO Auto-generated method stub
        return null;
    }

}
