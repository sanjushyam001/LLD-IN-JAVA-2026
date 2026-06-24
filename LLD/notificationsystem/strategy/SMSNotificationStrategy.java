package notificationsystem.strategy;

public class SMSNotificationStrategy implements NotificationStrategy {

    @Override
    public void sendNotification(String content) {
        System.out.println("SMSNotificationStrategy:sendNotification():void " + content);
    }

}
