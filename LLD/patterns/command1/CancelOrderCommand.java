package patterns.command1;

public class CancelOrderCommand implements Command {

    private OrderService service;

    public CancelOrderCommand() {
        this.service = new OrderService();
    }

    public void execute() {
        service.cancelOrder();
    }
}
