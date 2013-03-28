
package com.adyen.services.recurring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreTokenResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreTokenResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rechargeReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurringDetailReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreTokenResult", propOrder = {
    "rechargeReference",
    "recurringDetailReference",
    "result"
})
public class StoreTokenResult {

    @XmlElement(nillable = true)
    protected String rechargeReference;
    @XmlElement(nillable = true)
    protected String recurringDetailReference;
    @XmlElement(nillable = true)
    protected String result;

    /**
     * Gets the value of the rechargeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeReference() {
        return rechargeReference;
    }

    /**
     * Sets the value of the rechargeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeReference(String value) {
        this.rechargeReference = value;
    }

    /**
     * Gets the value of the recurringDetailReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringDetailReference() {
        return recurringDetailReference;
    }

    /**
     * Sets the value of the recurringDetailReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringDetailReference(String value) {
        this.recurringDetailReference = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

}
