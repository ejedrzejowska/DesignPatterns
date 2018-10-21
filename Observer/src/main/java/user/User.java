package user;

import message.Message;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer{

    private String fullName;
    private List<Message> messages;

    public User(String fullName) {
        this.fullName = fullName;
        messages = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public void update(Object arg) {
        messages.add((Message)arg);
        System.out.println((((Message)arg).getContent()) + " " + this.getFullName() + " " + ((Message)arg).getLocalDateTime());
    }
}
