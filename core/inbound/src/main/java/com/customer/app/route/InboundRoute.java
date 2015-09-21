package com.customer.app.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customer.app.rest.impl.InboundResource;

@Component
public class InboundRoute extends RouteBuilder {

    private static final String CXF_ENDPOINT = "cxfrs:bean:inboundService";

    @Autowired
    InboundResource service;

    @Override
    public void configure() throws Exception {
        from(CXF_ENDPOINT).choice().when(header(CxfConstants.OPERATION_NAME).isEqualTo("postInbound")).bean(service, "postInbound")
        // jaxb to xml
            .otherwise().log(LoggingLevel.WARN, "unknown method");
    }

}