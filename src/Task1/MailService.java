package Task1;

import java.util.*;
import java.util.function.Consumer;

/** RUS
 * Почтовый сервис. Получает, хранит и выдает по запросу сообщения\посылки
 * @param <T> тип наполнения сообщения\посылки
 * @see Task1.Message
 */
/** ENG
 * Mail service. Receives, stores and get messages\parcel upon request
 * @param <T> messages\parcel filling type
 * @see Task1.Message
 */
public class MailService <T> implements Consumer<Message<T>> {

    /** RUS
     * Почтовый ящик. Содержит все сообщения\посылки, отправленные конкретному получателю(ключ)
     *
     * Переопределен метод .get для получения пустого списка сообщений,
     * при запросе сообщения\посылки для неизвестного получателя
     */
    /** ENG
     * Mailbox. Contains all messages\parcel sent to specific recipient(key)
     *
     * Overridden the .get method to get empty message list when requesting
     * messages\parcel for a unknown recipient
     */
    private Map<String, List<T>> mailBox = new HashMap<>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, new LinkedList<T>());
        }
    };

    /** RUS
     * Добавление сообщения\посылки в почтовый ящик
     * @param message сообщение\посылка
     */
    /** ENG
     * Add a messages\parcel to the mailbox
     * @param message messages\parcel
     */
    @Override
    public void accept(Message message) {

        if (!mailBox.containsKey(message.getTo()))
            mailBox.put(message.getTo(), new ArrayList<>());

        mailBox.get(message.getTo()).add((T) message.getContent());
    }

    /** RUS
     * Функция получения почтового ящика
     * @return возвращает почтовый ящик
     */
    /** ENG
     * Function to get the mailbox
     * @return return the mailbox
     */
    public Map<String, List<T>> getMailBox() { return mailBox; }
}
