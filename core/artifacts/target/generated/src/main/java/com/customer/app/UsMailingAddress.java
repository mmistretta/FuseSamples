//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 04:02:17 PM EDT 
//


package com.customer.app;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * UsMailingAddress
 * 
 * <p>Java class for UsMailingAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsMailingAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.davita.com}Address"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usastate" type="{http://www.davita.com}Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsMailingAddress", propOrder = {
    "usastate"
})
@XmlRootElement(name = "UsMailingAddress")
public class UsMailingAddress
    extends Address
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code usastate;

    /**
     * Gets the value of the usastate property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getUsastate() {
        return usastate;
    }

    /**
     * Sets the value of the usastate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setUsastate(Code value) {
        this.usastate = value;
    }

}
