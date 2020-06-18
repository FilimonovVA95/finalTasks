package Task1;

public abstract class Message<T> {

    public abstract String getTo();

    public abstract String getFrom();

    public abstract T getContent();
}
