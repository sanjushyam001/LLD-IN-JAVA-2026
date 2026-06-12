package LLD.patterns.bridge;

public abstract class Payment {

    protected PaymentGateway paymentGateway;

    public Payment(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public abstract void makePayment(PaymentRequest paymentRequest);

}
