package patterns.command1;

public class PlaceOrderCommand implements Command {

    private OrderService service;

    public PlaceOrderCommand() {
        this.service = new OrderService();
    }

    public void execute() {
        service.placeOrder();
    }
}
