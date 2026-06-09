package patterns.adaptor;

public class PaymentProcessor {

    private PaymentService paymentService;

    // public PaymentProcessor(PaymentService paymentService) {
    // this.paymentService = paymentService;
    // }

    public void processPayment(PaymentService paymentService, double amount) {
        paymentService.pay(amount);
    }
}
