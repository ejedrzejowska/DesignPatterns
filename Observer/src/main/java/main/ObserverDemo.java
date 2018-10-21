package main;

import message.Message;
import message.MessagePublisher;
import user.Observer;
import user.User;

import java.time.LocalDateTime;

public class ObserverDemo {
    public static void main(String[] args) {
        Observer o1 = new User("Jan Kowalski");
        Observer o2 = new User("Anna Nowak");
        Observer o3 = new User("Joanna Konieczny");

        MessagePublisher messagePublisher = new MessagePublisher();
        messagePublisher.registerObserver(o1);
        messagePublisher.registerObserver(o2);
        messagePublisher.registerObserver(o3);

        Message m = new Message("Sample content", LocalDateTime.now());
        messagePublisher.notifyObservers(m);

        messagePublisher.unregisterObserver(o2);

        System.out.println("============================");
        Message m2 = new Message("Another sample content", LocalDateTime.now());
        messagePublisher.notifyObservers(m2);
    }
}
