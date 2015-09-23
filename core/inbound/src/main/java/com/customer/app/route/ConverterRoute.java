package com.customer.app.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.stereotype.Component;

@Component
public class ConverterRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        DataFormat df = new JaxbDataFormat("com.customer.app");

        //@formatter:off 
        from("direct:transform")
            .streamCaching()
            .log(LoggingLevel.INFO, "${body}")
            .marshal(df)
            .inOnly()
            .to("activemq:queue:inboundQueue");
        //@formatter:on
    }
}
