package Task1;

public class Salary extends Message{

    private String from;
    private String to;
    private int sal;

    public Salary(String from, String to, int sal) {
        this.from = from;
        this.to = to;
        this.sal = sal;
    }

    public String getTo() {
        return to;
    }
}
