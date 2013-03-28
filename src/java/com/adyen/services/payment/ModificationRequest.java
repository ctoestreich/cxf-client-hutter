
package com.adyen.services.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.adyen.services.common.Amount;


/**
 * <p>Java class for ModificationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModificationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalData" type="{http://payment.services.adyen.com}anyType2anyTypeMap" minOccurs="0"/>
 *         &lt;element name="authorisationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modificationAmount" type="{http://common.services.adyen.com}Amount" minOccurs="0"/>
 *         &lt;element name="originalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationRequest", propOrder = {
    "additionalData",
    "authorisationCode",
    "merchantAccount",
    "modificationAmount",
    "originalReference"
})
public class ModificationRequest {

    @XmlElement(nillable = true)
    protected AnyType2AnyTypeMap additionalData;
    @XmlElement(nillable = true)
    protected String authorisationCode;
    @XmlElement(nillable = true)
    protected String merchantAccount;
    @XmlElement(nillable = true)
    protected Amount modificationAmount;
    @XmlElement(nillable = true)
    protected String originalReference;

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType2AnyTypeMap }
     *     
     */
    public AnyType2AnyTypeMap getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType2AnyTypeMap }
     *     
     */
    public void setAdditionalData(AnyType2AnyTypeMap value) {
        this.additionalData = value;
    }

    /**
     * Gets the value of the authorisationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorisationCode() {
        return authorisationCode;
    }

    /**
     * Sets the value of the authorisationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorisationCode(String value) {
        this.authorisationCode = value;
    }

    /**
     * Gets the value of the merchantAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantAccount() {
        return merchantAccount;
    }

    /**
     * Sets the value of the merchantAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantAccount(String value) {
        this.merchantAccount = value;
    }

    /**
     * Gets the value of the modificationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getModificationAmount() {
        return modificationAmount;
    }

    /**
     * Sets the value of the modificationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setModificationAmount(Amount value) {
        this.modificationAmount = value;
    }

    /**
     * Gets the value of the originalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalReference() {
        return originalReference;
    }

    /**
     * Sets the value of the originalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalReference(String value) {
        this.originalReference = value;
    }

}
