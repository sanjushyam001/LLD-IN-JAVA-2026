package patterns.adaptor;

public class PayWithRazorPayment implements PaymentService {

    private RazorPayment razorPayment;

    public PayWithRazorPayment() {
        this.razorPayment = new RazorPayment();
    }

    @Override
    public void pay(double amount) {
        razorPayment.makePayment(amount);
    }

}
