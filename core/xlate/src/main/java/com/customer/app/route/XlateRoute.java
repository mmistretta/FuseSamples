package com.customer.app.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.TypeConversionException;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customer.app.processor.XlateProcessor;

@Component
public class XlateRoute extends RouteBuilder {

    @Autowired
    XlateProcessor processor;

    @Override
    public void configure() throws Exception {
        DataFormat df = new JaxbDataFormat("com.customer.app");

        DataFormat df2 = new JaxbDataFormat("com.sun.mdm.index.webservice");

        //@formatter:off 
        
        onException(TypeConversionException.class).handled(true).maximumRedeliveries(3).to("activemq:queue:dlq");
        
        from("activemq:queue:inboundQueue")
            .log(LoggingLevel.INFO, "XML received")
            .unmarshal(df)
            .bean(processor, "process")
            .marshal(df2)
            .to("activemq:queue:xlate")
            ;
        
        //@formatter:on

    }
}
