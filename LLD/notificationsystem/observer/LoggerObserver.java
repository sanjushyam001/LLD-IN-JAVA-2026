package notificationsystem.observer;

import notificationsystem.decorator.INotification;

public class LoggerObserver implements IObserver {

    @Override
    public void update(INotification notification) {
        System.out.println("LoggerObserver:update():void " + notification.getContent());
    }

}
