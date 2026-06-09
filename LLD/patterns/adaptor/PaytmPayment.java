package patterns.adaptor;

public class PaytmPayment {

    public void sendPayment(double amount) {
        System.out.println("PaytmPayment::sendPayment() called with amount " + amount);
    }
}
