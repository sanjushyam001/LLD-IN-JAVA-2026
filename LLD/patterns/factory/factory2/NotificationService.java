package patterns.factory.factory2;

public abstract class NotificationService {

    public abstract Notification createNotification();

    public void notifyUser(String message) {

        Notification notification = createNotification();
        notification.send(message);
    }
}
