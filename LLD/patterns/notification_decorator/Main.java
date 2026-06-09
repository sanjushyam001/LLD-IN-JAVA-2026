package patterns.notification_decorator;

public class Main {

    public static void main(String[] args) {

        Notification notification = new EmailNotification();
        notification = new SMSDecorator(notification);
        notification = new WhatsAppDecorator(notification);
        notification.send("Hello Friends ..");
    }
}
