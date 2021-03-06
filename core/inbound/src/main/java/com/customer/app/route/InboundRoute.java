package com.customer.app.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.springframework.stereotype.Component;

@Component
public class InboundRoute extends RouteBuilder {

    private static final String CXF_ENDPOINT = "cxfrs:bean:inboundService?bindingStyle=SimpleConsumer";

    @Override
    public void configure() throws Exception {
        //@formatter:off 
        from(CXF_ENDPOINT)
            .choice()
                .when(header(CxfConstants.OPERATION_NAME).isEqualTo("postInbound"))
                    .to("direct:transform")
                .otherwise()
                    .log(LoggingLevel.WARN, "unknown method");
        //@formatter:on
    }

}
