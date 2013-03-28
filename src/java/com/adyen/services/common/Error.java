
package com.adyen.services.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Error.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Error">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="NotAllowed"/>
 *     &lt;enumeration value="NoAmountSpecified"/>
 *     &lt;enumeration value="UnableToDetermineVariant"/>
 *     &lt;enumeration value="InvalidMerchantAccount"/>
 *     &lt;enumeration value="RequestMissing"/>
 *     &lt;enumeration value="InternalError"/>
 *     &lt;enumeration value="UnableToProcess"/>
 *     &lt;enumeration value="PaymentDetailsAreNotSupported"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Error")
@XmlEnum
public enum Error {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("NotAllowed")
    NOT_ALLOWED("NotAllowed"),
    @XmlEnumValue("NoAmountSpecified")
    NO_AMOUNT_SPECIFIED("NoAmountSpecified"),
    @XmlEnumValue("UnableToDetermineVariant")
    UNABLE_TO_DETERMINE_VARIANT("UnableToDetermineVariant"),
    @XmlEnumValue("InvalidMerchantAccount")
    INVALID_MERCHANT_ACCOUNT("InvalidMerchantAccount"),
    @XmlEnumValue("RequestMissing")
    REQUEST_MISSING("RequestMissing"),
    @XmlEnumValue("InternalError")
    INTERNAL_ERROR("InternalError"),
    @XmlEnumValue("UnableToProcess")
    UNABLE_TO_PROCESS("UnableToProcess"),
    @XmlEnumValue("PaymentDetailsAreNotSupported")
    PAYMENT_DETAILS_ARE_NOT_SUPPORTED("PaymentDetailsAreNotSupported");
    private final String value;

    Error(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Error fromValue(String v) {
        for (Error c: Error.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
