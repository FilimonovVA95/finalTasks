package Task1;

public class Message<T> {

    private String from;
    private String to;
    private T content;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public T getContent() {
        return content;
    }

    private void setFrom(String from) {
        this.from = from;
    }

    private void setTo(String to) {
        this.to = to;
    }

    private void setContent(T content) {
        this.content = content;
    }

    public Message(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }
}
