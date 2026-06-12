package LLD.patterns.bridge;

public class UpiPayment extends Payment {

    public UpiPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);

    }

    @Override
    public void makePayment(PaymentRequest paymentRequest) {

        UpiPaymentRequest request = (UpiPaymentRequest) paymentRequest;
        request.setType(PaymentType.UPI);
        paymentGateway.processPayment(paymentRequest);
    }

}
