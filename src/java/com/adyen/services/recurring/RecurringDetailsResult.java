
package com.adyen.services.recurring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RecurringDetailsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringDetailsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="details" type="{http://recurring.services.adyen.com}ArrayOfRecurringDetail" minOccurs="0"/>
 *         &lt;element name="lastKnownShopperEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopperReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringDetailsResult", propOrder = {
    "creationDate",
    "details",
    "lastKnownShopperEmail",
    "shopperReference"
})
public class RecurringDetailsResult {

    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(nillable = true)
    protected ArrayOfRecurringDetail details;
    @XmlElement(nillable = true)
    protected String lastKnownShopperEmail;
    @XmlElement(nillable = true)
    protected String shopperReference;

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecurringDetail }
     *     
     */
    public ArrayOfRecurringDetail getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecurringDetail }
     *     
     */
    public void setDetails(ArrayOfRecurringDetail value) {
        this.details = value;
    }

    /**
     * Gets the value of the lastKnownShopperEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastKnownShopperEmail() {
        return lastKnownShopperEmail;
    }

    /**
     * Sets the value of the lastKnownShopperEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastKnownShopperEmail(String value) {
        this.lastKnownShopperEmail = value;
    }

    /**
     * Gets the value of the shopperReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopperReference() {
        return shopperReference;
    }

    /**
     * Sets the value of the shopperReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopperReference(String value) {
        this.shopperReference = value;
    }

}
