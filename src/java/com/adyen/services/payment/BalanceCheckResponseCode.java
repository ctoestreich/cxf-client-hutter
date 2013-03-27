
package com.adyen.services.payment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceCheckResponseCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BalanceCheckResponseCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="NO_BALANCE"/>
 *     &lt;enumeration value="NOT_CHECKED"/>
 *     &lt;enumeration value="NOT_ALLOWED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BalanceCheckResponseCode")
@XmlEnum
public enum BalanceCheckResponseCode {

    OK,
    NO_BALANCE,
    NOT_CHECKED,
    NOT_ALLOWED;

    public String value() {
        return name();
    }

    public static BalanceCheckResponseCode fromValue(String v) {
        return valueOf(v);
    }

}
