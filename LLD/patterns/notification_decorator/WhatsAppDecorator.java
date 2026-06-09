package patterns.notification_decorator;

public class WhatsAppDecorator extends NotificationDecorator {

    public WhatsAppDecorator(Notification notification) {
        super(notification);
    }

    public void send(String message) {
        notification.send(message);
        sendWhatsApp(message);
    }

    private void sendWhatsApp(String message) {
        System.out.println(" = > WhatsApp ");
    }

}
