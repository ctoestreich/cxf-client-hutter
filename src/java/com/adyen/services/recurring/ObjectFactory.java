
package com.adyen.services.recurring;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.adyen.services.common.ServiceException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.adyen.services.recurring package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServiceException_QNAME = new QName("http://recurring.services.adyen.com", "ServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.adyen.services.recurring
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecurringDetailsRequest }
     * 
     */
    public RecurringDetailsRequest createRecurringDetailsRequest() {
        return new RecurringDetailsRequest();
    }

    /**
     * Create an instance of {@link DeactivateRecurringResponse }
     * 
     */
    public DeactivateRecurringResponse createDeactivateRecurringResponse() {
        return new DeactivateRecurringResponse();
    }

    /**
     * Create an instance of {@link InitialiseRecurring }
     * 
     */
    public InitialiseRecurring createInitialiseRecurring() {
        return new InitialiseRecurring();
    }

    /**
     * Create an instance of {@link StoreTokenRequest }
     * 
     */
    public StoreTokenRequest createStoreTokenRequest() {
        return new StoreTokenRequest();
    }

    /**
     * Create an instance of {@link InitialiseRecurringResponse }
     * 
     */
    public InitialiseRecurringResponse createInitialiseRecurringResponse() {
        return new InitialiseRecurringResponse();
    }

    /**
     * Create an instance of {@link SubmitRecurring }
     * 
     */
    public SubmitRecurring createSubmitRecurring() {
        return new SubmitRecurring();
    }

    /**
     * Create an instance of {@link ListRecurringDetails }
     * 
     */
    public ListRecurringDetails createListRecurringDetails() {
        return new ListRecurringDetails();
    }

    /**
     * Create an instance of {@link StoreToken }
     * 
     */
    public StoreToken createStoreToken() {
        return new StoreToken();
    }

    /**
     * Create an instance of {@link RecurringDetail }
     * 
     */
    public RecurringDetail createRecurringDetail() {
        return new RecurringDetail();
    }

    /**
     * Create an instance of {@link RecurringResult }
     * 
     */
    public RecurringResult createRecurringResult() {
        return new RecurringResult();
    }

    /**
     * Create an instance of {@link ArrayOfRecurringDetail }
     * 
     */
    public ArrayOfRecurringDetail createArrayOfRecurringDetail() {
        return new ArrayOfRecurringDetail();
    }

    /**
     * Create an instance of {@link DisableResponse }
     * 
     */
    public DisableResponse createDisableResponse() {
        return new DisableResponse();
    }

    /**
     * Create an instance of {@link Disable }
     * 
     */
    public Disable createDisable() {
        return new Disable();
    }

    /**
     * Create an instance of {@link RecurringRequest }
     * 
     */
    public RecurringRequest createRecurringRequest() {
        return new RecurringRequest();
    }

    /**
     * Create an instance of {@link DisableRequest }
     * 
     */
    public DisableRequest createDisableRequest() {
        return new DisableRequest();
    }

    /**
     * Create an instance of {@link DeactivateRecurring }
     * 
     */
    public DeactivateRecurring createDeactivateRecurring() {
        return new DeactivateRecurring();
    }

    /**
     * Create an instance of {@link SubmitRecurringResponse }
     * 
     */
    public SubmitRecurringResponse createSubmitRecurringResponse() {
        return new SubmitRecurringResponse();
    }

    /**
     * Create an instance of {@link ListRecurringDetailsResponse }
     * 
     */
    public ListRecurringDetailsResponse createListRecurringDetailsResponse() {
        return new ListRecurringDetailsResponse();
    }

    /**
     * Create an instance of {@link StoreTokenResponse }
     * 
     */
    public StoreTokenResponse createStoreTokenResponse() {
        return new StoreTokenResponse();
    }

    /**
     * Create an instance of {@link DisableResult }
     * 
     */
    public DisableResult createDisableResult() {
        return new DisableResult();
    }

    /**
     * Create an instance of {@link StoreTokenResult }
     * 
     */
    public StoreTokenResult createStoreTokenResult() {
        return new StoreTokenResult();
    }

    /**
     * Create an instance of {@link RecurringDetailsResult }
     * 
     */
    public RecurringDetailsResult createRecurringDetailsResult() {
        return new RecurringDetailsResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://recurring.services.adyen.com", name = "ServiceException")
    public JAXBElement<ServiceException> createServiceException(ServiceException value) {
        return new JAXBElement<ServiceException>(_ServiceException_QNAME, ServiceException.class, null, value);
    }

}
