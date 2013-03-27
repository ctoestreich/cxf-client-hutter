
package com.adyen.services.payment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.adyen.services.common.ServiceException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.adyen.services.payment package. 
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

    private final static QName _ServiceException_QNAME = new QName("http://payment.services.adyen.com", "ServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.adyen.services.payment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentRequest }
     * 
     */
    public PaymentRequest createPaymentRequest() {
        return new PaymentRequest();
    }

    /**
     * Create an instance of {@link ArrayOfFraudCheckResult }
     * 
     */
    public ArrayOfFraudCheckResult createArrayOfFraudCheckResult() {
        return new ArrayOfFraudCheckResult();
    }

    /**
     * Create an instance of {@link FundTransferResult }
     * 
     */
    public FundTransferResult createFundTransferResult() {
        return new FundTransferResult();
    }

    /**
     * Create an instance of {@link CancelResponse }
     * 
     */
    public CancelResponse createCancelResponse() {
        return new CancelResponse();
    }

    /**
     * Create an instance of {@link BalanceCheckResponse }
     * 
     */
    public BalanceCheckResponse createBalanceCheckResponse() {
        return new BalanceCheckResponse();
    }

    /**
     * Create an instance of {@link CheckFraudResponse }
     * 
     */
    public CheckFraudResponse createCheckFraudResponse() {
        return new CheckFraudResponse();
    }

    /**
     * Create an instance of {@link ForexQuote }
     * 
     */
    public ForexQuote createForexQuote() {
        return new ForexQuote();
    }

    /**
     * Create an instance of {@link RefundResponse }
     * 
     */
    public RefundResponse createRefundResponse() {
        return new RefundResponse();
    }

    /**
     * Create an instance of {@link Directdebit }
     * 
     */
    public Directdebit createDirectdebit() {
        return new Directdebit();
    }

    /**
     * Create an instance of {@link ModificationRequest }
     * 
     */
    public ModificationRequest createModificationRequest() {
        return new ModificationRequest();
    }

    /**
     * Create an instance of {@link Recurring }
     * 
     */
    public Recurring createRecurring() {
        return new Recurring();
    }

    /**
     * Create an instance of {@link Authorise3DResponse }
     * 
     */
    public Authorise3DResponse createAuthorise3DResponse() {
        return new Authorise3DResponse();
    }

    /**
     * Create an instance of {@link BalanceCheck }
     * 
     */
    public BalanceCheck createBalanceCheck() {
        return new BalanceCheck();
    }

    /**
     * Create an instance of {@link FundTransfer }
     * 
     */
    public FundTransfer createFundTransfer() {
        return new FundTransfer();
    }

    /**
     * Create an instance of {@link CheckFraud }
     * 
     */
    public CheckFraud createCheckFraud() {
        return new CheckFraud();
    }

    /**
     * Create an instance of {@link FraudCheckResult }
     * 
     */
    public FraudCheckResult createFraudCheckResult() {
        return new FraudCheckResult();
    }

    /**
     * Create an instance of {@link DirectdebitResponse }
     * 
     */
    public DirectdebitResponse createDirectdebitResponse() {
        return new DirectdebitResponse();
    }

    /**
     * Create an instance of {@link CancelOrRefundResponse }
     * 
     */
    public CancelOrRefundResponse createCancelOrRefundResponse() {
        return new CancelOrRefundResponse();
    }

    /**
     * Create an instance of {@link PaymentRequest3D }
     * 
     */
    public PaymentRequest3D createPaymentRequest3D() {
        return new PaymentRequest3D();
    }

    /**
     * Create an instance of {@link AnyType2AnyTypeMap }
     * 
     */
    public AnyType2AnyTypeMap createAnyType2AnyTypeMap() {
        return new AnyType2AnyTypeMap();
    }

    /**
     * Create an instance of {@link CaptureResponse }
     * 
     */
    public CaptureResponse createCaptureResponse() {
        return new CaptureResponse();
    }

    /**
     * Create an instance of {@link Refund }
     * 
     */
    public Refund createRefund() {
        return new Refund();
    }

    /**
     * Create an instance of {@link FraudResult }
     * 
     */
    public FraudResult createFraudResult() {
        return new FraudResult();
    }

    /**
     * Create an instance of {@link Authorise3D }
     * 
     */
    public Authorise3D createAuthorise3D() {
        return new Authorise3D();
    }

    /**
     * Create an instance of {@link AuthoriseResponse }
     * 
     */
    public AuthoriseResponse createAuthoriseResponse() {
        return new AuthoriseResponse();
    }

    /**
     * Create an instance of {@link ModificationResult }
     * 
     */
    public ModificationResult createModificationResult() {
        return new ModificationResult();
    }

    /**
     * Create an instance of {@link DirectDebitResponse2 }
     * 
     */
    public DirectDebitResponse2 createDirectDebitResponse2() {
        return new DirectDebitResponse2();
    }

    /**
     * Create an instance of {@link ThreeDSecureData }
     * 
     */
    public ThreeDSecureData createThreeDSecureData() {
        return new ThreeDSecureData();
    }

    /**
     * Create an instance of {@link ELV }
     * 
     */
    public ELV createELV() {
        return new ELV();
    }

    /**
     * Create an instance of {@link AnyType2AnyTypeMap.Entry }
     * 
     */
    public AnyType2AnyTypeMap.Entry createAnyType2AnyTypeMapEntry() {
        return new AnyType2AnyTypeMap.Entry();
    }

    /**
     * Create an instance of {@link AuthoriseReferralResponse }
     * 
     */
    public AuthoriseReferralResponse createAuthoriseReferralResponse() {
        return new AuthoriseReferralResponse();
    }

    /**
     * Create an instance of {@link BalanceCheckResult }
     * 
     */
    public BalanceCheckResult createBalanceCheckResult() {
        return new BalanceCheckResult();
    }

    /**
     * Create an instance of {@link FundTransferResponse }
     * 
     */
    public FundTransferResponse createFundTransferResponse() {
        return new FundTransferResponse();
    }

    /**
     * Create an instance of {@link FundTransferRequest }
     * 
     */
    public FundTransferRequest createFundTransferRequest() {
        return new FundTransferRequest();
    }

    /**
     * Create an instance of {@link PaymentResult }
     * 
     */
    public PaymentResult createPaymentResult() {
        return new PaymentResult();
    }

    /**
     * Create an instance of {@link CancelOrRefund }
     * 
     */
    public CancelOrRefund createCancelOrRefund() {
        return new CancelOrRefund();
    }

    /**
     * Create an instance of {@link Authorise }
     * 
     */
    public Authorise createAuthorise() {
        return new Authorise();
    }

    /**
     * Create an instance of {@link Cancel }
     * 
     */
    public Cancel createCancel() {
        return new Cancel();
    }

    /**
     * Create an instance of {@link RefundWithData }
     * 
     */
    public RefundWithData createRefundWithData() {
        return new RefundWithData();
    }

    /**
     * Create an instance of {@link RefundWithDataResponse }
     * 
     */
    public RefundWithDataResponse createRefundWithDataResponse() {
        return new RefundWithDataResponse();
    }

    /**
     * Create an instance of {@link DirectDebitRequest }
     * 
     */
    public DirectDebitRequest createDirectDebitRequest() {
        return new DirectDebitRequest();
    }

    /**
     * Create an instance of {@link Card }
     * 
     */
    public Card createCard() {
        return new Card();
    }

    /**
     * Create an instance of {@link Capture }
     * 
     */
    public Capture createCapture() {
        return new Capture();
    }

    /**
     * Create an instance of {@link BankAccount }
     * 
     */
    public BankAccount createBankAccount() {
        return new BankAccount();
    }

    /**
     * Create an instance of {@link AuthoriseReferral }
     * 
     */
    public AuthoriseReferral createAuthoriseReferral() {
        return new AuthoriseReferral();
    }

    /**
     * Create an instance of {@link BalanceCheckRequest }
     * 
     */
    public BalanceCheckRequest createBalanceCheckRequest() {
        return new BalanceCheckRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payment.services.adyen.com", name = "ServiceException")
    public JAXBElement<ServiceException> createServiceException(ServiceException value) {
        return new JAXBElement<ServiceException>(_ServiceException_QNAME, ServiceException.class, null, value);
    }

}
