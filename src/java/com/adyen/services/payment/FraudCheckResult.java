
package com.adyen.services.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FraudCheckResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FraudCheckResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="checkId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudCheckResult", propOrder = {
    "accountScore",
    "checkId",
    "name"
})
public class FraudCheckResult {

    protected int accountScore;
    protected int checkId;
    @XmlElement(required = true)
    protected String name;

    /**
     * Gets the value of the accountScore property.
     * 
     */
    public int getAccountScore() {
        return accountScore;
    }

    /**
     * Sets the value of the accountScore property.
     * 
     */
    public void setAccountScore(int value) {
        this.accountScore = value;
    }

    /**
     * Gets the value of the checkId property.
     * 
     */
    public int getCheckId() {
        return checkId;
    }

    /**
     * Sets the value of the checkId property.
     * 
     */
    public void setCheckId(int value) {
        this.checkId = value;
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

}
