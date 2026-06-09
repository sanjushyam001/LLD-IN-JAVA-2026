package patterns.facde;

public class OrderFacde {

    OrderService orderService = new OrderService();
    PaymentService paymentService = new PaymentService();
    InventoryService inventoryService = new InventoryService();
    ShipingService shipingService = new ShipingService();
    NotificationService notificationService = new NotificationService();

    public void placeOrder() {
        orderService.createOrder();
        paymentService.payment();
        inventoryService.stock();
        shipingService.ship();
        notificationService.message();

    }
}
