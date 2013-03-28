
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
 *         &lt;element name="cancelOrRefundResult" type="{http://payment.services.adyen.com}ModificationResult"/>
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
    "cancelOrRefundResult"
})
@XmlRootElement(name = "cancelOrRefundResponse")
public class CancelOrRefundResponse {

    @XmlElement(required = true, nillable = true)
    protected ModificationResult cancelOrRefundResult;

    /**
     * Gets the value of the cancelOrRefundResult property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationResult }
     *     
     */
    public ModificationResult getCancelOrRefundResult() {
        return cancelOrRefundResult;
    }

    /**
     * Sets the value of the cancelOrRefundResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationResult }
     *     
     */
    public void setCancelOrRefundResult(ModificationResult value) {
        this.cancelOrRefundResult = value;
    }

}
