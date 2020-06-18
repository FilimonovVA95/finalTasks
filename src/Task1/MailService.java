package Task1;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService <T> implements Consumer<Message> {

    @Override
    public void accept(Message message) {

    }

    @Override
    public Consumer<Message> andThen(Consumer<? super Message> after) {
        return null;
    }

    public Map<String, List<T>> getMailBox() {
        return null;
    }
}
