
package com.adyen.services.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.adyen.services.common.Address;
import com.adyen.services.common.Amount;
import com.adyen.services.common.BrowserInfo;


/**
 * <p>Java class for DirectDebitRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectDebitRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalAmount" type="{http://common.services.adyen.com}Amount" minOccurs="0"/>
 *         &lt;element name="additionalData" type="{http://payment.services.adyen.com}anyType2anyTypeMap" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://common.services.adyen.com}Amount" minOccurs="0"/>
 *         &lt;element name="bankAccount" type="{http://payment.services.adyen.com}BankAccount" minOccurs="0"/>
 *         &lt;element name="browserInfo" type="{http://common.services.adyen.com}BrowserInfo" minOccurs="0"/>
 *         &lt;element name="dccQuote" type="{http://payment.services.adyen.com}ForexQuote" minOccurs="0"/>
 *         &lt;element name="deliveryAddress" type="{http://common.services.adyen.com}Address" minOccurs="0"/>
 *         &lt;element name="fraudOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="merchantAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurring" type="{http://payment.services.adyen.com}Recurring" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectedBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectedRecurringDetailReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopperEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopperIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopperInteraction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopperReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopperStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitRequest", propOrder = {
    "additionalAmount",
    "additionalData",
    "amount",
    "bankAccount",
    "browserInfo",
    "dccQuote",
    "deliveryAddress",
    "fraudOffset",
    "merchantAccount",
    "orderReference",
    "recurring",
    "reference",
    "selectedBrand",
    "selectedRecurringDetailReference",
    "sessionId",
    "shopperEmail",
    "shopperIP",
    "shopperInteraction",
    "shopperReference",
    "shopperStatement"
})
public class DirectDebitRequest {

    @XmlElement(nillable = true)
    protected Amount additionalAmount;
    @XmlElement(nillable = true)
    protected AnyType2AnyTypeMap additionalData;
    @XmlElement(nillable = true)
    protected Amount amount;
    @XmlElement(nillable = true)
    protected BankAccount bankAccount;
    @XmlElement(nillable = true)
    protected BrowserInfo browserInfo;
    @XmlElement(nillable = true)
    protected ForexQuote dccQuote;
    @XmlElement(nillable = true)
    protected Address deliveryAddress;
    @XmlElement(nillable = true)
    protected Integer fraudOffset;
    @XmlElement(nillable = true)
    protected String merchantAccount;
    @XmlElement(nillable = true)
    protected String orderReference;
    @XmlElement(nillable = true)
    protected Recurring recurring;
    @XmlElement(nillable = true)
    protected String reference;
    @XmlElement(nillable = true)
    protected String selectedBrand;
    @XmlElement(nillable = true)
    protected String selectedRecurringDetailReference;
    @XmlElement(nillable = true)
    protected String sessionId;
    @XmlElement(nillable = true)
    protected String shopperEmail;
    @XmlElement(nillable = true)
    protected String shopperIP;
    @XmlElement(nillable = true)
    protected String shopperInteraction;
    @XmlElement(nillable = true)
    protected String shopperReference;
    @XmlElement(nillable = true)
    protected String shopperStatement;

    /**
     * Gets the value of the additionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * Sets the value of the additionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAdditionalAmount(Amount value) {
        this.additionalAmount = value;
    }

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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setBankAccount(BankAccount value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the browserInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BrowserInfo }
     *     
     */
    public BrowserInfo getBrowserInfo() {
        return browserInfo;
    }

    /**
     * Sets the value of the browserInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowserInfo }
     *     
     */
    public void setBrowserInfo(BrowserInfo value) {
        this.browserInfo = value;
    }

    /**
     * Gets the value of the dccQuote property.
     * 
     * @return
     *     possible object is
     *     {@link ForexQuote }
     *     
     */
    public ForexQuote getDccQuote() {
        return dccQuote;
    }

    /**
     * Sets the value of the dccQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForexQuote }
     *     
     */
    public void setDccQuote(ForexQuote value) {
        this.dccQuote = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDeliveryAddress(Address value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the fraudOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFraudOffset() {
        return fraudOffset;
    }

    /**
     * Sets the value of the fraudOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFraudOffset(Integer value) {
        this.fraudOffset = value;
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
     * Gets the value of the orderReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderReference() {
        return orderReference;
    }

    /**
     * Sets the value of the orderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderReference(String value) {
        this.orderReference = value;
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
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the selectedBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedBrand() {
        return selectedBrand;
    }

    /**
     * Sets the value of the selectedBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedBrand(String value) {
        this.selectedBrand = value;
    }

    /**
     * Gets the value of the selectedRecurringDetailReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedRecurringDetailReference() {
        return selectedRecurringDetailReference;
    }

    /**
     * Sets the value of the selectedRecurringDetailReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedRecurringDetailReference(String value) {
        this.selectedRecurringDetailReference = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the shopperEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopperEmail() {
        return shopperEmail;
    }

    /**
     * Sets the value of the shopperEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopperEmail(String value) {
        this.shopperEmail = value;
    }

    /**
     * Gets the value of the shopperIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopperIP() {
        return shopperIP;
    }

    /**
     * Sets the value of the shopperIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopperIP(String value) {
        this.shopperIP = value;
    }

    /**
     * Gets the value of the shopperInteraction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopperInteraction() {
        return shopperInteraction;
    }

    /**
     * Sets the value of the shopperInteraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopperInteraction(String value) {
        this.shopperInteraction = value;
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

    /**
     * Gets the value of the shopperStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopperStatement() {
        return shopperStatement;
    }

    /**
     * Sets the value of the shopperStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopperStatement(String value) {
        this.shopperStatement = value;
    }

}
