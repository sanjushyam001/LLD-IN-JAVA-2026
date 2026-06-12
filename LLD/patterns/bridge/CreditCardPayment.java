package LLD.patterns.bridge;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);

    }

    @Override
    public void makePayment(PaymentRequest paymentRequest) {

        CreditCardPaymentRequest request = (CreditCardPaymentRequest) paymentRequest;
        request.setType(PaymentType.CREDIT);
        paymentGateway.processPayment(request);
    }

}
