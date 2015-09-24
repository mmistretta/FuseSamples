package com.customer.app.processor;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

import com.sun.mdm.index.webservice.ExecuteMatchUpdate;

@Component
public class SoapRequestHelper {

    public void process(Exchange exchange) {
        ExecuteMatchUpdate e = exchange.getIn().getBody(ExecuteMatchUpdate.class);
        final List<Object> params = new ArrayList<Object>();
        params.add(e.getCallerInfo());
        params.add(e.getSysObjBean());
        exchange.getIn().setBody(params);
    }

}
