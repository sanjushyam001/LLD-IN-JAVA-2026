package patterns.factory.factory1;

public class PayPalPayment implements PaymentProcessor {

    @Override
    public void processPayment() {
        System.out.println("Payment is procession by PayPal.. ");
    }

}