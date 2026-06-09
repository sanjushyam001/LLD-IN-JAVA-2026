package patterns.adaptor;

public class PayWithPaytmPayment implements PaymentService {

    private PaytmPayment paytmPayment;

    public PayWithPaytmPayment() {
        this.paytmPayment = new PaytmPayment();
    }

    @Override
    public void pay(double amount) {
        paytmPayment.sendPayment(amount);
    }

}
