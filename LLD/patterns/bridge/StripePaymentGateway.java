package LLD.patterns.bridge;

public class StripePaymentGateway implements PaymentGateway {

    @Override
    public void processPayment(PaymentRequest paymentRequest) {

        PaymentType type = paymentRequest.getType();

        switch (type) {
            case UPI:

                System.out.println("UPI ID: " + paymentRequest.getAmount());
                break;
            case CREDIT:
                System.out.println("CREDIT CARD: " + paymentRequest.getAmount());

                break;

            default:
                System.out.println("INVALID PAYMENT METHOD !");
                break;
        }
        System.out.println("Payment done by StripePaymentGateway ");
    }

}