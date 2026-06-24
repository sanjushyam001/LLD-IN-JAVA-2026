package notificationsystem.observer;

import java.util.ArrayList;
import java.util.List;

import notificationsystem.decorator.INotification;
import notificationsystem.strategy.NotificationStrategy;

public class NotificationEngineObserver implements IObserver {

    private List<NotificationStrategy> strategies = new ArrayList<>();

    public void addStrategy(NotificationStrategy strategy) {
        strategies.add(strategy);
    }

    @Override
    public void update(INotification notification) {

        for (NotificationStrategy strategy : strategies) {
            strategy.sendNotification(notification.getContent());
        }
    }

}
