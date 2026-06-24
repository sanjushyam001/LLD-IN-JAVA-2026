package notificationsystem.test;

import java.util.List;

import notificationsystem.decorator.INotification;
import notificationsystem.decorator.SimpleNotification;
import notificationsystem.decorator.TemplateNotificationDecorator;
import notificationsystem.observer.LoggerObserver;
import notificationsystem.observer.NotificationEngineObserver;
import notificationsystem.service.NotificationService;
import notificationsystem.strategy.EmailNotificationStrategy;
import notificationsystem.strategy.SMSNotificationStrategy;

public class Main {
    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        NotificationEngineObserver notificationEngine = new NotificationEngineObserver();
        notificationEngine.addStrategy(new EmailNotificationStrategy());
        notificationEngine.addStrategy(new SMSNotificationStrategy());
        service.addRecievers(List.of(new LoggerObserver(), notificationEngine));
        INotification notification = new SimpleNotification();
        notification = new TemplateNotificationDecorator(notification);

        service.notifyRecievers(notification);

    }
}
