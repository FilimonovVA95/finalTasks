package Task1;

import java.util.*;
import java.util.function.Consumer;

public class MailService <T> implements Consumer<Message> {

    private Map<String, List<T>> mailBox = new HashMap<>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, new LinkedList<T>());
        }
    };

    @Override
    public void accept(Message message) {

        if (!mailBox.containsKey(message.getTo()))
            mailBox.put(message.getTo(), new ArrayList<>());

        mailBox.get(message.getTo()).add((T) message.getContent());
    }

    public Map<String, List<T>> getMailBox() { return mailBox; }
}
