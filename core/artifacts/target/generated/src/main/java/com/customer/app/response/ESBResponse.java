//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.22 at 02:55:16 PM EDT 
//


package com.customer.app.response;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.davita.com.response}MessageId"/&gt;
 *         &lt;element ref="{http://www.davita.com.response}RecordIdentifier"/&gt;
 *         &lt;element ref="{http://www.davita.com.response}MessageType"/&gt;
 *         &lt;element ref="{http://www.davita.com.response}Publisher"/&gt;
 *         &lt;element ref="{http://www.davita.com.response}Destination"/&gt;
 *         &lt;element ref="{http://www.davita.com.response}BusinessKey"/&gt;
 *         &lt;element ref="{http://www.davita.com.response}EUID"/&gt;
 *         &lt;element ref="{http://www.davita.com.response}ProviderID"/&gt;
 *         &lt;element ref="{http://www.davita.com.response}FacilityID"/&gt;
 *         &lt;element ref="{http://www.davita.com.response}ESBMessageSignature"/&gt;
 *         &lt;element ref="{http://www.davita.com.response}ESBProcessDate"/&gt;
 *         &lt;element ref="{http://www.davita.com.response}Published"/&gt;
 *         &lt;element ref="{http://www.davita.com.response}Comment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageId",
    "recordIdentifier",
    "messageType",
    "publisher",
    "destination",
    "businessKey",
    "euid",
    "providerID",
    "facilityID",
    "esbMessageSignature",
    "esbProcessDate",
    "published",
    "comment"
})
@XmlRootElement(name = "ESBResponse")
public class ESBResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MessageId", required = true)
    protected String messageId;
    @XmlElement(name = "RecordIdentifier", required = true)
    protected String recordIdentifier;
    @XmlElement(name = "MessageType", required = true)
    protected String messageType;
    @XmlElement(name = "Publisher", required = true)
    protected String publisher;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "BusinessKey", required = true)
    protected String businessKey;
    @XmlElement(name = "EUID", required = true)
    protected String euid;
    @XmlElement(name = "ProviderID", required = true)
    protected String providerID;
    @XmlElement(name = "FacilityID", required = true)
    protected String facilityID;
    @XmlElement(name = "ESBMessageSignature", required = true)
    protected String esbMessageSignature;
    @XmlElement(name = "ESBProcessDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar esbProcessDate;
    @XmlElement(name = "Published")
    protected boolean published;
    @XmlElement(name = "Comment", required = true)
    protected String comment;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the recordIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordIdentifier() {
        return recordIdentifier;
    }

    /**
     * Sets the value of the recordIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordIdentifier(String value) {
        this.recordIdentifier = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the businessKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessKey() {
        return businessKey;
    }

    /**
     * Sets the value of the businessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessKey(String value) {
        this.businessKey = value;
    }

    /**
     * Gets the value of the euid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUID() {
        return euid;
    }

    /**
     * Sets the value of the euid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUID(String value) {
        this.euid = value;
    }

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderID(String value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the facilityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityID() {
        return facilityID;
    }

    /**
     * Sets the value of the facilityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityID(String value) {
        this.facilityID = value;
    }

    /**
     * Gets the value of the esbMessageSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESBMessageSignature() {
        return esbMessageSignature;
    }

    /**
     * Sets the value of the esbMessageSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESBMessageSignature(String value) {
        this.esbMessageSignature = value;
    }

    /**
     * Gets the value of the esbProcessDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getESBProcessDate() {
        return esbProcessDate;
    }

    /**
     * Sets the value of the esbProcessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setESBProcessDate(XMLGregorianCalendar value) {
        this.esbProcessDate = value;
    }

    /**
     * Gets the value of the published property.
     * 
     */
    public boolean isPublished() {
        return published;
    }

    /**
     * Sets the value of the published property.
     * 
     */
    public void setPublished(boolean value) {
        this.published = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
