package message;

import user.Observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        observers.forEach(observer ->{
            observer.update(arg);
        });
    }
}
