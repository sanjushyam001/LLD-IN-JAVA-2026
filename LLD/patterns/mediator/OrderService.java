package LLD.patterns.mediator;

public class OrderService {

    private NotificationMediator mediator;
    private String type;

    public OrderService(NotificationMediator mediator) {
        this.mediator = mediator;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void placeOrder(Order order) {
        mediator.notify(this.type, order.getOrderId() + " Order has been sent ");
    }
}
