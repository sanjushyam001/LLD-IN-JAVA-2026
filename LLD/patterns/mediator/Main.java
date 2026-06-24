package LLD.patterns.mediator;

public class Main {

    public static void main(String[] args) {

        // ChatMediator mediator = new ChatRoom();

        // User shyam = new BasicUser(mediator, "SHYAM");
        // User yuvi = new BasicUser(mediator, "YUVI");
        // User tarun = new BasicUser(mediator, "TARUN");
        // User suresh = new BasicUser(mediator, "PANKAJ");
        // mediator.addUser(shyam);
        // mediator.addUser(yuvi);
        // mediator.addUser(tarun);
        // mediator.addUser(suresh);
        // shyam.send("Hello I am shyam !");

        OrderService orderService = new OrderService(new NotificationMediatorImpl());
        orderService.setType("sms");
        Order order = new Order();
        order.setOrderId(1002);

        orderService.placeOrder(order);

    }
}
