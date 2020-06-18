package Task1;

public class Salary extends Message <Integer> {

    private String from;
    private String to;
    private Integer content;

    public Salary(String from, String to, int content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public Integer getContent() {
        return content;
    }
}
