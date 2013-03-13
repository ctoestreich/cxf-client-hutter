package org.grails.cxf.client.test

import com.adyen.services.common.Amount
import com.adyen.services.recurring.RecurringPortType
import com.adyen.services.recurring.RecurringRequest
import com.adyen.services.recurring.RecurringResult
import grails.plugin.spock.IntegrationSpec
import javax.xml.bind.JAXBElement
import org.codehaus.groovy.grails.commons.GrailsApplication

/**
 */
class RecurringPaymentClientSpec extends IntegrationSpec {

    RecurringPortType recurringPaymentClient
    GrailsApplication grailsApplication

    def "test the secured invocation of the service"() {
        given:
        def amount = new Amount(value: 5, currency: 'USD')
        RecurringRequest recurringRequest = new RecurringRequest(
                amount: new Amount(currency: 'USD', value: 5L),
                merchantAccount: grailsApplication.config.cxf.client.recurringPaymentClient.username,
                shopperEmail: 'cxfclienttest@mailinator.com')

        when:
        RecurringResult recurringResult = recurringPaymentClient.submitRecurring(recurringRequest)
        println recurringResult

        then:
        recurringResult.response
    }
}
