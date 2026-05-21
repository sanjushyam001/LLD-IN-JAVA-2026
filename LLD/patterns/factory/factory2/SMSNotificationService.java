package patterns.factory.factory2;

public class SMSNotificationService extends NotificationService {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }

}