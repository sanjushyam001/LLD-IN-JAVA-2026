package notificationsystem.observer;

import java.util.ArrayList;
import java.util.List;

public interface IObserable {

    List<IObserver> observers = new ArrayList<>();

    public void addObserver(IObserver observer);

    public void removeObserver();

    public void notifyAllObservers();
}
