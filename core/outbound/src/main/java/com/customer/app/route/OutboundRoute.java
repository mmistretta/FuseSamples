package com.customer.app.route;

import java.net.ConnectException;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customer.app.processor.SoapRequestHelper;

@Component
public class OutboundRoute extends RouteBuilder {

    @Autowired
    SoapRequestHelper helper;

    @Override
    public void configure() throws Exception {
        DataFormat df2 = new JaxbDataFormat("com.sun.mdm.index.webservice");

        //@formatter:off 
        
        onException(ConnectException.class).handled(true).maximumRedeliveries(3).to("activemq:queue:dlq");
        
        from("activemq:queue:xlate")
            .log(LoggingLevel.INFO, "Execute Match Update received")
            .unmarshal(df2)
            .bean(helper, "process")
            .setHeader(CxfConstants.OPERATION_NAMESPACE, simple("http://webservice.index.mdm.sun.com/"))
            .setHeader(CxfConstants.OPERATION_NAME, simple("executeMatchUpdate"))    
            .to("cxf:http://localhost:8181/cxf/PersonEJBService/PersonEJB?serviceClass=com.sun.mdm.index.webservice.PersonEJB")
            ;
        
        //@formatter:on

    }

}
