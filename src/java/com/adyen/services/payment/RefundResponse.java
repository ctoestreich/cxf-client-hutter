
package com.adyen.services.payment;

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
 *         &lt;element name="refundResult" type="{http://payment.services.adyen.com}ModificationResult"/>
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
    "refundResult"
})
@XmlRootElement(name = "refundResponse")
public class RefundResponse {

    @XmlElement(required = true, nillable = true)
    protected ModificationResult refundResult;

    /**
     * Gets the value of the refundResult property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationResult }
     *     
     */
    public ModificationResult getRefundResult() {
        return refundResult;
    }

    /**
     * Sets the value of the refundResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationResult }
     *     
     */
    public void setRefundResult(ModificationResult value) {
        this.refundResult = value;
    }

}
