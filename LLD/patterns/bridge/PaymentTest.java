package LLD.patterns.bridge;

public class PaymentTest {
    public static void main(String[] args) {

        UpiPaymentRequest upiRequest = new UpiPaymentRequest();
        upiRequest.setAmount(500.00);
        CreditCardPaymentRequest creditRequest = new CreditCardPaymentRequest();
        creditRequest.setAmount(700.00);

        PaymentGateway razorGateway = new RazorpayPaymentGateway();
        PaymentGateway stripeGateway = new StripePaymentGateway();
        Payment upiPayment = new UpiPayment(razorGateway);
        upiPayment.makePayment(upiRequest);
        Payment creditCardPayment = new CreditCardPayment(stripeGateway);
        creditCardPayment.makePayment(creditRequest);

    }
}
