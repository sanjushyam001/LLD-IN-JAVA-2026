package patterns.adaptor;

import java.util.Map;
import java.util.HashMap;

public class PaymentFactory {

    Map<String, PaymentService> paymentServices = new HashMap<>();

    public PaymentFactory(Map<String, PaymentService> paymentServices) {
        this.paymentServices = paymentServices;
    }

    public PaymentService getPaymentService(String type) {
        PaymentService paymentService = paymentServices.get(type.toUpperCase());
        if (paymentService == null) {
            System.out.println("Invalid payment");
        }
        return paymentService;
    }

}
