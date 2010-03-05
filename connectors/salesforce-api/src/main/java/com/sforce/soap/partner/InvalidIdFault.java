
package com.sforce.soap.partner;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.6
 * Thu Feb 11 15:37:56 EST 2010
 * Generated source version: 2.2.6
 * 
 */

@WebFault(name = "InvalidIdFault", targetNamespace = "urn:fault.partner.soap.sforce.com")
public class InvalidIdFault extends Exception {
    public static final long serialVersionUID = 20100211153756L;
    
    private com.sforce.soap.partner.fault.InvalidIdFault invalidIdFault;

    public InvalidIdFault() {
        super();
    }
    
    public InvalidIdFault(String message) {
        super(message);
    }
    
    public InvalidIdFault(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIdFault(String message, com.sforce.soap.partner.fault.InvalidIdFault invalidIdFault) {
        super(message);
        this.invalidIdFault = invalidIdFault;
    }

    public InvalidIdFault(String message, com.sforce.soap.partner.fault.InvalidIdFault invalidIdFault, Throwable cause) {
        super(message, cause);
        this.invalidIdFault = invalidIdFault;
    }

    public com.sforce.soap.partner.fault.InvalidIdFault getFaultInfo() {
        return this.invalidIdFault;
    }
}
