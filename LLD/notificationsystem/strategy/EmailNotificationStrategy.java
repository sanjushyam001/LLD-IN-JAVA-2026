package notificationsystem.strategy;

public class EmailNotificationStrategy implements NotificationStrategy {

    @Override
    public void sendNotification(String content) {
        System.out.println("EmailNotificationStrategy:sendNotification():void " + content);
    }

}
