
package com.adyen.services.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFraudCheckResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFraudCheckResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FraudCheckResult" type="{http://payment.services.adyen.com}FraudCheckResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFraudCheckResult", propOrder = {
    "fraudCheckResult"
})
public class ArrayOfFraudCheckResult {

    @XmlElement(name = "FraudCheckResult", nillable = true)
    protected List<FraudCheckResult> fraudCheckResult;

    /**
     * Gets the value of the fraudCheckResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fraudCheckResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFraudCheckResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FraudCheckResult }
     * 
     * 
     */
    public List<FraudCheckResult> getFraudCheckResult() {
        if (fraudCheckResult == null) {
            fraudCheckResult = new ArrayList<FraudCheckResult>();
        }
        return this.fraudCheckResult;
    }

}
