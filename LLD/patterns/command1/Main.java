package patterns.command1;

public class Main {

    public static void main(String[] args) {

        OrderInvoker oi = new OrderInvoker();
        oi.setCommand(new PlaceOrderCommand());
        oi.process();
        oi.setCommand(new CancelOrderCommand());
        oi.process();

    }
}
