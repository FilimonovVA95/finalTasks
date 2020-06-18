package Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService <T> implements Consumer<Message>  {

    private Map<String, List<T>> mailBox = new HashMap<>();

    @Override
    public void accept(Message message) {

        if (!mailBox.containsKey(message.getTo()))
            mailBox.put(message.getTo(), new ArrayList<>());

        mailBox.get(message.getTo()).add((T) message.getContent());

    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}
