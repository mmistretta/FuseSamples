package com.customer.app.converter;

import org.springframework.core.convert.converter.Converter;

import com.customer.app.Patient;
import com.sun.mdm.index.webservice.CallerInfo;
import com.sun.mdm.index.webservice.ExecuteMatchUpdate;

public class PatientToExecuteMatchUpdateConverter implements Converter<Patient, ExecuteMatchUpdate> {

    @Override
    public ExecuteMatchUpdate convert(Patient p) {
        ExecuteMatchUpdate e = new ExecuteMatchUpdate();
        CallerInfo ci = new CallerInfo();
        ci.setUser(p.getFirstName() + " " + p.getLastName());
        e.setCallerInfo(ci);
        return e;
    }
}
