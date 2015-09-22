package com.customer.app.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customer.app.rest.impl.InboundResource;

@Component
public class ConverterRoute extends RouteBuilder {

    @Autowired
    InboundResource service;

    @Override
    public void configure() throws Exception {
        //@formatter:off 
        from("direct:transform")
           .log(LoggingLevel.INFO, "Ready to transform");
        //@formatter:on
    }

}
