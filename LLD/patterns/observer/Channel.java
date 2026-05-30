package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void uploadVideo(String title) {
        System.out.println("New video has been uploaded.. " + title);
        notifySubscribers(title);
    }

    private void notifySubscribers(String title) {
        for (Observer observer : observers) {
            observer.update(title);
        }
    }

}
