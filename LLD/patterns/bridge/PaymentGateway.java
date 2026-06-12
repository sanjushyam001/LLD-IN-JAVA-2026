package LLD.patterns.bridge;

public interface PaymentGateway {

    void processPayment(PaymentRequest paymentRequest);
}
