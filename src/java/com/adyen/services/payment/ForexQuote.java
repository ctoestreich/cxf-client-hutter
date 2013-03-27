
package com.adyen.services.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.adyen.services.common.Amount;


/**
 * <p>Java class for ForexQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForexQuote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseAmount" type="{http://common.services.adyen.com}Amount" minOccurs="0"/>
 *         &lt;element name="basePoints" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="buy" type="{http://common.services.adyen.com}Amount" minOccurs="0"/>
 *         &lt;element name="interbank" type="{http://common.services.adyen.com}Amount" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sell" type="{http://common.services.adyen.com}Amount" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validTill" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForexQuote", propOrder = {
    "account",
    "accountType",
    "baseAmount",
    "basePoints",
    "buy",
    "interbank",
    "reference",
    "sell",
    "signature",
    "source",
    "type",
    "validTill"
})
public class ForexQuote {

    @XmlElement(nillable = true)
    protected String account;
    @XmlElement(nillable = true)
    protected String accountType;
    @XmlElement(nillable = true)
    protected Amount baseAmount;
    protected int basePoints;
    @XmlElement(nillable = true)
    protected Amount buy;
    @XmlElement(nillable = true)
    protected Amount interbank;
    @XmlElement(nillable = true)
    protected String reference;
    @XmlElement(nillable = true)
    protected Amount sell;
    @XmlElement(nillable = true)
    protected String signature;
    @XmlElement(nillable = true)
    protected String source;
    @XmlElement(nillable = true)
    protected String type;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validTill;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setBaseAmount(Amount value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the basePoints property.
     * 
     */
    public int getBasePoints() {
        return basePoints;
    }

    /**
     * Sets the value of the basePoints property.
     * 
     */
    public void setBasePoints(int value) {
        this.basePoints = value;
    }

    /**
     * Gets the value of the buy property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getBuy() {
        return buy;
    }

    /**
     * Sets the value of the buy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setBuy(Amount value) {
        this.buy = value;
    }

    /**
     * Gets the value of the interbank property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getInterbank() {
        return interbank;
    }

    /**
     * Sets the value of the interbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setInterbank(Amount value) {
        this.interbank = value;
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
     * Gets the value of the sell property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getSell() {
        return sell;
    }

    /**
     * Sets the value of the sell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setSell(Amount value) {
        this.sell = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the validTill property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTill() {
        return validTill;
    }

    /**
     * Sets the value of the validTill property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTill(XMLGregorianCalendar value) {
        this.validTill = value;
    }

}
