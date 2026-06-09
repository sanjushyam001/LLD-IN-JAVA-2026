package patterns.adaptor;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // PayWithRazorPayment razorPayment = new PayWithRazorPayment();
        // // PaymentProcessor paymentProcessor = new PaymentProcessor(razorPayment);
        // PaymentProcessor paymentProcessor1 = new PaymentProcessor();
        // paymentProcessor1.processPayment(razorPayment, 200.00);
        // PayWithPaytmPayment paytmPayment = new PayWithPaytmPayment();
        // // PaymentProcessor paymentProcessor1 = new PaymentProcessor(paytmPayment);
        // PaymentProcessor paymentProcessor2 = new PaymentProcessor();
        // paymentProcessor2.processPayment(paytmPayment, 500.00);

        Map<String, PaymentService> paymentServices = new HashMap<>();
        paymentServices.put("PAYTM", new PayWithPaytmPayment());
        paymentServices.put("RAZORPAY", new PayWithRazorPayment());

        PaymentFactory paymentFactory = new PaymentFactory(paymentServices);

        PaymentProcessor processPayment = new PaymentProcessor();

        PaymentService paymentService = paymentFactory.getPaymentService("paytm");

        processPayment.processPayment(paymentService, 700.40);
    }
}
