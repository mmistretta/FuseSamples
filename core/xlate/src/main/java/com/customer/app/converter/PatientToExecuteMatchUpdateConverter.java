package com.customer.app.converter;

import org.springframework.core.convert.converter.Converter;

import com.customer.app.Patient;
import com.sun.mdm.index.webservice.CallerInfo;
import com.sun.mdm.index.webservice.ExecuteMatchUpdate;
import com.sun.mdm.index.webservice.SystemPerson;

public class PatientToExecuteMatchUpdateConverter implements Converter<Patient, ExecuteMatchUpdate> {

    @Override
    public ExecuteMatchUpdate convert(Patient p) {
        ExecuteMatchUpdate e = new ExecuteMatchUpdate();
        CallerInfo ci = new CallerInfo();
        ci.setUser(p.getFirstName() + " " + p.getLastName());
        SystemPerson sp = new SystemPerson();
        sp.setCreateUser(p.getFirstName() + " " + p.getLastName());
        sp.setStatus("active");
        e.setCallerInfo(ci);
        e.setSysObjBean(sp);
        return e;
    }
}
