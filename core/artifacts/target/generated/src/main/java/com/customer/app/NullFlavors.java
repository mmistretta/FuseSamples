//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 04:02:17 PM EDT 
//


package com.customer.app;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NullFlavors.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NullFlavors"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="askedbutunknown"/&gt;
 *     &lt;enumeration value="derived"/&gt;
 *     &lt;enumeration value="invalid"/&gt;
 *     &lt;enumeration value="masked"/&gt;
 *     &lt;enumeration value="negativeinfinity"/&gt;
 *     &lt;enumeration value="noinformation"/&gt;
 *     &lt;enumeration value="notapplicable"/&gt;
 *     &lt;enumeration value="notasked"/&gt;
 *     &lt;enumeration value="positiveinfinity"/&gt;
 *     &lt;enumeration value="sufficientquantity"/&gt;
 *     &lt;enumeration value="temporarilyunavailable"/&gt;
 *     &lt;enumeration value="trace"/&gt;
 *     &lt;enumeration value="unencoded"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NullFlavors")
@XmlEnum
public enum NullFlavors {

    @XmlEnumValue("askedbutunknown")
    ASKEDBUTUNKNOWN("askedbutunknown"),
    @XmlEnumValue("derived")
    DERIVED("derived"),
    @XmlEnumValue("invalid")
    INVALID("invalid"),
    @XmlEnumValue("masked")
    MASKED("masked"),
    @XmlEnumValue("negativeinfinity")
    NEGATIVEINFINITY("negativeinfinity"),
    @XmlEnumValue("noinformation")
    NOINFORMATION("noinformation"),
    @XmlEnumValue("notapplicable")
    NOTAPPLICABLE("notapplicable"),
    @XmlEnumValue("notasked")
    NOTASKED("notasked"),
    @XmlEnumValue("positiveinfinity")
    POSITIVEINFINITY("positiveinfinity"),
    @XmlEnumValue("sufficientquantity")
    SUFFICIENTQUANTITY("sufficientquantity"),
    @XmlEnumValue("temporarilyunavailable")
    TEMPORARILYUNAVAILABLE("temporarilyunavailable"),
    @XmlEnumValue("trace")
    TRACE("trace"),
    @XmlEnumValue("unencoded")
    UNENCODED("unencoded"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    NullFlavors(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NullFlavors fromValue(String v) {
        for (NullFlavors c: NullFlavors.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
