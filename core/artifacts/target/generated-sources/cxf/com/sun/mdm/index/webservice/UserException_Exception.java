
package com.sun.mdm.index.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.14
 * 2015-09-22T15:35:45.208-04:00
 * Generated source version: 2.7.14
 */

@WebFault(name = "UserException", targetNamespace = "http://webservice.index.mdm.sun.com/")
public class UserException_Exception extends Exception {
    
    private com.sun.mdm.index.webservice.UserException userException;

    public UserException_Exception() {
        super();
    }
    
    public UserException_Exception(String message) {
        super(message);
    }
    
    public UserException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UserException_Exception(String message, com.sun.mdm.index.webservice.UserException userException) {
        super(message);
        this.userException = userException;
    }

    public UserException_Exception(String message, com.sun.mdm.index.webservice.UserException userException, Throwable cause) {
        super(message, cause);
        this.userException = userException;
    }

    public com.sun.mdm.index.webservice.UserException getFaultInfo() {
        return this.userException;
    }
}
