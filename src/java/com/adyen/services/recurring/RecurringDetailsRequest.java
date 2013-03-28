
package com.adyen.services.recurring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.adyen.services.payment.Recurring;


/**
 * <p>Java class for RecurringDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringDetailsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurring" type="{http://payment.services.adyen.com}Recurring" minOccurs="0"/>
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
@XmlType(name = "RecurringDetailsRequest", propOrder = {
    "customReference",
    "merchantAccount",
    "recurring",
    "shopperReference"
})
public class RecurringDetailsRequest {

    @XmlElement(nillable = true)
    protected String customReference;
    @XmlElement(nillable = true)
    protected String merchantAccount;
    @XmlElement(nillable = true)
    protected Recurring recurring;
    @XmlElement(nillable = true)
    protected String shopperReference;

    /**
     * Gets the value of the customReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomReference() {
        return customReference;
    }

    /**
     * Sets the value of the customReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomReference(String value) {
        this.customReference = value;
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
     * Gets the value of the recurring property.
     * 
     * @return
     *     possible object is
     *     {@link Recurring }
     *     
     */
    public Recurring getRecurring() {
        return recurring;
    }

    /**
     * Sets the value of the recurring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recurring }
     *     
     */
    public void setRecurring(Recurring value) {
        this.recurring = value;
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
