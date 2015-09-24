package com.customer.app.route;

import java.net.ConnectException;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.stereotype.Component;

import com.sun.mdm.index.webservice.ExecuteMatchUpdate;

@Component
public class OutboundRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // DataFormat df = new JaxbDataFormat("com.customer.app");

        ExecuteMatchUpdate e = new ExecuteMatchUpdate();
        DataFormat df2 = new JaxbDataFormat("com.sun.mdm.index.webservice");

        //@formatter:off 
        
        onException(ConnectException.class).handled(true).maximumRedeliveries(3).to("activemq:queue:dlq");
        
        from("activemq:queue:xlate")
            .log(LoggingLevel.INFO, "Execute Match Update received")
            .unmarshal(df2)
            ;
        
        //@formatter:on

    }

}
