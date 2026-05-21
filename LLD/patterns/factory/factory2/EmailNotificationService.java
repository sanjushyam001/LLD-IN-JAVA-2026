package patterns.factory.factory2;

public class EmailNotificationService extends NotificationService {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }

}
