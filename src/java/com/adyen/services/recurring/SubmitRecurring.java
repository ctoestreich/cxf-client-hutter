
package com.adyen.services.recurring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recurringRequest" type="{http://recurring.services.adyen.com}RecurringRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recurringRequest"
})
@XmlRootElement(name = "submitRecurring")
public class SubmitRecurring {

    @XmlElement(required = true, nillable = true)
    protected RecurringRequest recurringRequest;

    /**
     * Gets the value of the recurringRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringRequest }
     *     
     */
    public RecurringRequest getRecurringRequest() {
        return recurringRequest;
    }

    /**
     * Sets the value of the recurringRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringRequest }
     *     
     */
    public void setRecurringRequest(RecurringRequest value) {
        this.recurringRequest = value;
    }

}
