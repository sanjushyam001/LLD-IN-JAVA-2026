package patterns.factory.factory1;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = PaymentFactory.getPaymentInstance(PaymentMode.PAYPAL);
        paymentProcessor.processPayment();
    }
}
