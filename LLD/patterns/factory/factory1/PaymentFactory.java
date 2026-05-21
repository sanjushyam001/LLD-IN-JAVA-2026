package patterns.factory.factory1;

import java.nio.channels.UnsupportedAddressTypeException;

public class PaymentFactory {

    public static PaymentProcessor getPaymentInstance(PaymentMode paymentMode) throws UnsupportedAddressTypeException {

        if (paymentMode == PaymentMode.UPI) {
            return new UPIPayment();
        } else if (paymentMode == PaymentMode.PAYPAL) {
            return new PayPalPayment();
        } else {
            throw new UnsupportedOperationException("PaymentProcessor is not recognizable!");
        }
    }
}
