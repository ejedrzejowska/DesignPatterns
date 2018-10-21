package message;

import java.time.LocalDateTime;

public class Message {
    private String content;
    private LocalDateTime localDateTime;

    public Message(String content, LocalDateTime localDateTime) {
        this.content = content;
        this.localDateTime = localDateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
