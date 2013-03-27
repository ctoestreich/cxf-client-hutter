
package com.adyen.services.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.adyen.services.common.Amount;


/**
 * <p>Java class for PaymentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalData" type="{http://payment.services.adyen.com}anyType2anyTypeMap" minOccurs="0"/>
 *         &lt;element name="authCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dccAmount" type="{http://common.services.adyen.com}Amount" minOccurs="0"/>
 *         &lt;element name="dccSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraudResult" type="{http://payment.services.adyen.com}FraudResult" minOccurs="0"/>
 *         &lt;element name="issuerUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="md" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pspReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refusalReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentResult", propOrder = {
    "additionalData",
    "authCode",
    "dccAmount",
    "dccSignature",
    "fraudResult",
    "issuerUrl",
    "md",
    "paRequest",
    "pspReference",
    "refusalReason",
    "resultCode"
})
public class PaymentResult {

    @XmlElement(nillable = true)
    protected AnyType2AnyTypeMap additionalData;
    @XmlElement(nillable = true)
    protected String authCode;
    @XmlElement(nillable = true)
    protected Amount dccAmount;
    @XmlElement(nillable = true)
    protected String dccSignature;
    @XmlElement(nillable = true)
    protected FraudResult fraudResult;
    @XmlElement(nillable = true)
    protected String issuerUrl;
    @XmlElement(nillable = true)
    protected String md;
    @XmlElement(nillable = true)
    protected String paRequest;
    @XmlElement(nillable = true)
    protected String pspReference;
    @XmlElement(nillable = true)
    protected String refusalReason;
    @XmlElement(nillable = true)
    protected String resultCode;

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
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the dccAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getDccAmount() {
        return dccAmount;
    }

    /**
     * Sets the value of the dccAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setDccAmount(Amount value) {
        this.dccAmount = value;
    }

    /**
     * Gets the value of the dccSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDccSignature() {
        return dccSignature;
    }

    /**
     * Sets the value of the dccSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDccSignature(String value) {
        this.dccSignature = value;
    }

    /**
     * Gets the value of the fraudResult property.
     * 
     * @return
     *     possible object is
     *     {@link FraudResult }
     *     
     */
    public FraudResult getFraudResult() {
        return fraudResult;
    }

    /**
     * Sets the value of the fraudResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudResult }
     *     
     */
    public void setFraudResult(FraudResult value) {
        this.fraudResult = value;
    }

    /**
     * Gets the value of the issuerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerUrl() {
        return issuerUrl;
    }

    /**
     * Sets the value of the issuerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerUrl(String value) {
        this.issuerUrl = value;
    }

    /**
     * Gets the value of the md property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMd() {
        return md;
    }

    /**
     * Sets the value of the md property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMd(String value) {
        this.md = value;
    }

    /**
     * Gets the value of the paRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaRequest() {
        return paRequest;
    }

    /**
     * Sets the value of the paRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaRequest(String value) {
        this.paRequest = value;
    }

    /**
     * Gets the value of the pspReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPspReference() {
        return pspReference;
    }

    /**
     * Sets the value of the pspReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPspReference(String value) {
        this.pspReference = value;
    }

    /**
     * Gets the value of the refusalReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefusalReason() {
        return refusalReason;
    }

    /**
     * Sets the value of the refusalReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefusalReason(String value) {
        this.refusalReason = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

}
