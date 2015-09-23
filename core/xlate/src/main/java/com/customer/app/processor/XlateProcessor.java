package com.customer.app.processor;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

import com.customer.app.Patient;
import com.customer.app.converter.PatientToExecuteMatchUpdateConverter;
import com.sun.mdm.index.webservice.ExecuteMatchUpdate;

@Component
public class XlateProcessor {

    private static final PatientToExecuteMatchUpdateConverter converter = new PatientToExecuteMatchUpdateConverter();

    public void process(Exchange exchange) {
        Patient p = exchange.getIn().getBody(Patient.class);
        ExecuteMatchUpdate e = converter.convert(p);
        exchange.getIn().setBody(e);
    }

}
