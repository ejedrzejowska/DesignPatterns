package message;

import user.Observer;

public interface Publisher {
    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObservers(Object arg);

}
