
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
 *         &lt;element name="paymentRequest3d" type="{http://payment.services.adyen.com}PaymentRequest3d"/>
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
    "paymentRequest3D"
})
@XmlRootElement(name = "authorise3d")
public class Authorise3D {

    @XmlElement(name = "paymentRequest3d", required = true, nillable = true)
    protected PaymentRequest3D paymentRequest3D;

    /**
     * Gets the value of the paymentRequest3D property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRequest3D }
     *     
     */
    public PaymentRequest3D getPaymentRequest3D() {
        return paymentRequest3D;
    }

    /**
     * Sets the value of the paymentRequest3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRequest3D }
     *     
     */
    public void setPaymentRequest3D(PaymentRequest3D value) {
        this.paymentRequest3D = value;
    }

}
