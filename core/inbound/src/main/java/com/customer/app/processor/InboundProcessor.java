package com.customer.app.processor;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.customer.app.Patient;

@Component
public class InboundProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(InboundProcessor.class);

    public void processInbound(Exchange e) {

        Message in = e.getIn();

        Patient p = in.getBody(Patient.class);
        LOGGER.info("Rest request received");
        LOGGER.info("first name: " + p.getFirstName());
        Map<String, Object> headers = new HashMap<String, Object>();
        headers.put("person", p);
        in.setHeaders(headers);
    }
}
