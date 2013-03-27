package org.grails.cxf.client.test

import com.adyen.services.common.Amount
import com.adyen.services.recurring.RecurringPortType
import com.adyen.services.recurring.RecurringRequest
import com.adyen.services.recurring.RecurringResult
import grails.plugin.spock.IntegrationSpec
import org.codehaus.groovy.grails.commons.GrailsApplication
import com.adyen.services.payment.PaymentPortType
import com.adyen.services.payment.PaymentRequest
import com.adyen.services.payment.PaymentResult

/**
 */
class PaymentClientSpec extends IntegrationSpec {

    PaymentPortType paymentClient
    GrailsApplication grailsApplication

    def "test the secured invocation of the service"() {
        given:
        PaymentRequest paymentRequest = new PaymentRequest(
                amount: new Amount(currency: 'USD', value: 5L),
                merchantAccount: grailsApplication.config.cxf.client.recurringPaymentClient.username,
                shopperEmail: 'cxfclienttest@mailinator.com')

        when:
        PaymentResult paymentResult = paymentClient.authorise(paymentRequest)
        println paymentResult

        then:
        paymentResult.resultCode
    }
}
