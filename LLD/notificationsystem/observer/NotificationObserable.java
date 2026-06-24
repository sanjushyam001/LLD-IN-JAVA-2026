package notificationsystem.observer;

import notificationsystem.decorator.INotification;

public class NotificationObserable implements IObserable {

    private INotification notification;

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver() {
        observers.remove(observers);
    }

    @Override
    public void notifyAllObservers() {
        for (IObserver observer : observers) {
            observer.update(notification);
        }
    }

    public INotification getNotification() {
        return notification;
    }

    public void setNotification(INotification notification) {
        this.notification = notification;
        notifyAllObservers();
    }

}
