//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 04:02:17 PM EDT 
//


package com.customer.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Patient - a person receiving or registered to receive medical treatment.
 * 
 * <p>Java class for Patient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="begindate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="enddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="mothersidentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="patientid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourcesystemidentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="facilitynumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationtype" type="{http://www.davita.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.davita.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="HealthcareProvider" type="{http://www.davita.com}HealthcareProvider" minOccurs="0"/&gt;
 *         &lt;element name="HealthRecord" type="{http://www.davita.com}HealthRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PatientInformation" type="{http://www.davita.com}PatientInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient", propOrder = {
    "begindate",
    "enddate",
    "mothersidentifier",
    "patientid",
    "sourcesystemidentifier",
    "locationid",
    "facilitynumber",
    "locationtype",
    "status",
    "healthcareProvider",
    "healthRecords",
    "patientInformation"
})
@XmlRootElement(name = "Patient")
public class Patient
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar begindate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enddate;
    protected String mothersidentifier;
    protected String patientid;
    protected String sourcesystemidentifier;
    protected String locationid;
    protected String facilitynumber;
    protected Code locationtype;
    protected Code status;
    @XmlElement(name = "HealthcareProvider")
    protected HealthcareProvider healthcareProvider;
    @XmlElement(name = "HealthRecord")
    protected List<HealthRecord> healthRecords;
    @XmlElement(name = "PatientInformation")
    protected PatientInformation patientInformation;

    /**
     * Gets the value of the begindate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBegindate() {
        return begindate;
    }

    /**
     * Sets the value of the begindate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBegindate(XMLGregorianCalendar value) {
        this.begindate = value;
    }

    /**
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnddate() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnddate(XMLGregorianCalendar value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the mothersidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMothersidentifier() {
        return mothersidentifier;
    }

    /**
     * Sets the value of the mothersidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMothersidentifier(String value) {
        this.mothersidentifier = value;
    }

    /**
     * Gets the value of the patientid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientid() {
        return patientid;
    }

    /**
     * Sets the value of the patientid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientid(String value) {
        this.patientid = value;
    }

    /**
     * Gets the value of the sourcesystemidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcesystemidentifier() {
        return sourcesystemidentifier;
    }

    /**
     * Sets the value of the sourcesystemidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcesystemidentifier(String value) {
        this.sourcesystemidentifier = value;
    }

    /**
     * Gets the value of the locationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationid() {
        return locationid;
    }

    /**
     * Sets the value of the locationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationid(String value) {
        this.locationid = value;
    }

    /**
     * Gets the value of the facilitynumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilitynumber() {
        return facilitynumber;
    }

    /**
     * Sets the value of the facilitynumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilitynumber(String value) {
        this.facilitynumber = value;
    }

    /**
     * Gets the value of the locationtype property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getLocationtype() {
        return locationtype;
    }

    /**
     * Sets the value of the locationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setLocationtype(Code value) {
        this.locationtype = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setStatus(Code value) {
        this.status = value;
    }

    /**
     * Gets the value of the healthcareProvider property.
     * 
     * @return
     *     possible object is
     *     {@link HealthcareProvider }
     *     
     */
    public HealthcareProvider getHealthcareProvider() {
        return healthcareProvider;
    }

    /**
     * Sets the value of the healthcareProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthcareProvider }
     *     
     */
    public void setHealthcareProvider(HealthcareProvider value) {
        this.healthcareProvider = value;
    }

    /**
     * Gets the value of the healthRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthRecord }
     * 
     * 
     */
    public List<HealthRecord> getHealthRecords() {
        if (healthRecords == null) {
            healthRecords = new ArrayList<HealthRecord>();
        }
        return this.healthRecords;
    }

    /**
     * Gets the value of the patientInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PatientInformation }
     *     
     */
    public PatientInformation getPatientInformation() {
        return patientInformation;
    }

    /**
     * Sets the value of the patientInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientInformation }
     *     
     */
    public void setPatientInformation(PatientInformation value) {
        this.patientInformation = value;
    }

}
