package notificationsystem.observer;

import notificationsystem.decorator.INotification;

public interface IObserver {
    void update(INotification notification);
}
