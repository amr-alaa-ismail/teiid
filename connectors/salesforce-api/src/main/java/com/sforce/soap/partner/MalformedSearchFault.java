
package com.sforce.soap.partner;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.6
 * Thu Feb 11 15:37:56 EST 2010
 * Generated source version: 2.2.6
 * 
 */

@WebFault(name = "MalformedSearchFault", targetNamespace = "urn:fault.partner.soap.sforce.com")
public class MalformedSearchFault extends Exception {
    public static final long serialVersionUID = 20100211153756L;
    
    private com.sforce.soap.partner.fault.MalformedSearchFault malformedSearchFault;

    public MalformedSearchFault() {
        super();
    }
    
    public MalformedSearchFault(String message) {
        super(message);
    }
    
    public MalformedSearchFault(String message, Throwable cause) {
        super(message, cause);
    }

    public MalformedSearchFault(String message, com.sforce.soap.partner.fault.MalformedSearchFault malformedSearchFault) {
        super(message);
        this.malformedSearchFault = malformedSearchFault;
    }

    public MalformedSearchFault(String message, com.sforce.soap.partner.fault.MalformedSearchFault malformedSearchFault, Throwable cause) {
        super(message, cause);
        this.malformedSearchFault = malformedSearchFault;
    }

    public com.sforce.soap.partner.fault.MalformedSearchFault getFaultInfo() {
        return this.malformedSearchFault;
    }
}
