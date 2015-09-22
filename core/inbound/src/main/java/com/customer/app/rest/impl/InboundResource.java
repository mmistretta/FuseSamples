package com.customer.app.rest.impl;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.customer.app.Patient;

@Service
@Path("/rest")
public class InboundResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(InboundResource.class);

    @POST
    @Path("/inbound")
    @Consumes("application/xml")
    public Response postInbound(Patient person) {
        Response response = null;
        String recordId = Long.toString(System.nanoTime());
        LOGGER.info("Rest request received");

        if (!isValidRequest(person)) {
            LOGGER.error("Person was not valid");
            // response = buildResponse(400);
        } else {
            try {
                Map<String, Object> headers = new HashMap<String, Object>();
                headers.put("person", person);
            } catch (Exception ex) {
                LOGGER.error("Something went wrong");
            }
        }
        return response;
    }

    private boolean isValidRequest(Patient person) {
        return true;
    }
}
