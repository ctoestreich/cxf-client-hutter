
package com.adyen.services.recurring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.adyen.services.payment.BankAccount;
import com.adyen.services.payment.Card;
import com.adyen.services.payment.ELV;
import com.adyen.services.payment.Recurring;


/**
 * <p>Java class for StoreTokenRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreTokenRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bank" type="{http://payment.services.adyen.com}BankAccount" minOccurs="0"/>
 *         &lt;element name="card" type="{http://payment.services.adyen.com}Card" minOccurs="0"/>
 *         &lt;element name="elv" type="{http://payment.services.adyen.com}ELV" minOccurs="0"/>
 *         &lt;element name="merchantAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurring" type="{http://payment.services.adyen.com}Recurring" minOccurs="0"/>
 *         &lt;element name="shopperEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "StoreTokenRequest", propOrder = {
    "bank",
    "card",
    "elv",
    "merchantAccount",
    "name",
    "recurring",
    "shopperEmail",
    "shopperReference"
})
public class StoreTokenRequest {

    @XmlElement(nillable = true)
    protected BankAccount bank;
    @XmlElement(nillable = true)
    protected Card card;
    @XmlElement(nillable = true)
    protected ELV elv;
    @XmlElement(nillable = true)
    protected String merchantAccount;
    @XmlElement(nillable = true)
    protected String name;
    @XmlElement(nillable = true)
    protected Recurring recurring;
    @XmlElement(nillable = true)
    protected String shopperEmail;
    @XmlElement(nillable = true)
    protected String shopperReference;

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setBank(BankAccount value) {
        this.bank = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link Card }
     *     
     */
    public Card getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link Card }
     *     
     */
    public void setCard(Card value) {
        this.card = value;
    }

    /**
     * Gets the value of the elv property.
     * 
     * @return
     *     possible object is
     *     {@link ELV }
     *     
     */
    public ELV getElv() {
        return elv;
    }

    /**
     * Sets the value of the elv property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELV }
     *     
     */
    public void setElv(ELV value) {
        this.elv = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
