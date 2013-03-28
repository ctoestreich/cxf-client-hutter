
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
 *         &lt;element name="modificationRequest" type="{http://payment.services.adyen.com}ModificationRequest"/>
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
    "modificationRequest"
})
@XmlRootElement(name = "capture")
public class Capture {

    @XmlElement(required = true, nillable = true)
    protected ModificationRequest modificationRequest;

    /**
     * Gets the value of the modificationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationRequest }
     *     
     */
    public ModificationRequest getModificationRequest() {
        return modificationRequest;
    }

    /**
     * Sets the value of the modificationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationRequest }
     *     
     */
    public void setModificationRequest(ModificationRequest value) {
        this.modificationRequest = value;
    }

}
