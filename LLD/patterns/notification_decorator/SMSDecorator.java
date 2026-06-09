package patterns.notification_decorator;

public class SMSDecorator extends NotificationDecorator {

    public SMSDecorator(Notification notification) {
        super(notification);
    }

    public void send(String message) {
        notification.send(message);
        sendSMS(message);
    }

    private void sendSMS(String message) {
        System.out.println(" = > SMS ");
    }

}
