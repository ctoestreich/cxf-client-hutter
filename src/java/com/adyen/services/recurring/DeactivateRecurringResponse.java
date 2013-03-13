
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
 *         &lt;element name="recurringResult" type="{http://recurring.services.adyen.com}RecurringResult"/>
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
    "recurringResult"
})
@XmlRootElement(name = "deactivateRecurringResponse")
public class DeactivateRecurringResponse {

    @XmlElement(required = true, nillable = true)
    protected RecurringResult recurringResult;

    /**
     * Gets the value of the recurringResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringResult }
     *     
     */
    public RecurringResult getRecurringResult() {
        return recurringResult;
    }

    /**
     * Sets the value of the recurringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringResult }
     *     
     */
    public void setRecurringResult(RecurringResult value) {
        this.recurringResult = value;
    }

}
