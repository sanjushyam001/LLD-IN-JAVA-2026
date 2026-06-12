package LLD.patterns.bridge;

public class UpiPaymentRequest extends PaymentRequest {

    private String upiId;

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }
    
}
