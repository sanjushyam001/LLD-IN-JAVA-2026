package notificationsystem.service;

import java.util.List;

import javax.management.Notification;

import notificationsystem.decorator.INotification;
import notificationsystem.observer.IObserable;
import notificationsystem.observer.IObserver;
import notificationsystem.observer.NotificationObserable;
import patterns.observer.Observer;

public class NotificationService {

    NotificationObserable obserable = new NotificationObserable();

    public void addRecievers(List<IObserver> observers) {

        for (IObserver observer : observers) {

            obserable.addObserver(observer);
        }
    }

    public void notifyRecievers(INotification notification) {
        obserable.setNotification(notification);
    }
}
