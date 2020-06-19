package Task1;

/** RUS
 * Класс сообщения, посылки. Имеет поля отправителя, получателя и наполнения
 * @param <T> тип наполнения. То что должно быть отправлено в сообщении\посылке
 */
/** ENG
 * Class messages, parcel. Has a fields of sender, recipient and filling
 * @param <T> type of filling. What should be sent in the messages\parcel
 */
public class Message<T> {

    /**
     * Поля "от кого", "для кого", "наполнение"
     * Field "sender", "recipient", "filling"
     */
    private String from;
    private String to;
    private T content;

    /** RUS
     * Функция получения значения поля отправителя
     * @return возвращает имя отправителя
     */
    /** ENG
     * Function to get the sender value
     * @return return the name of the sender
     */
    public String getFrom() {
        return from;
    }

    /** RUS
     * Функция получения значения поля получателя
     * @return возвращает имя получателя
     */
    /** ENG
     * Function to get the recipient value
     * @return return the name of the recipient
     */
    public String getTo() {
        return to;
    }

    /** RUS
     * Функция получения значения поля наполнения
     * @return возвращает наполнение сообщения\посылки
     */
    /** ENG
     * Function to get the filling value
     * @return return the filling of the messages\parcel
     */
    public T getContent() {
        return content;
    }

    /** RUS
     * Создание сообщения\посылки с произвольным наполнением
     * @param from имя отправителя
     * @param to имя получателя
     * @param content произвольное наполнение
     */
    /** ENG
     * Constructs a message\parcel with arbitrary filling
     * @param from sender's name
     * @param to recipient's name
     * @param content arbitrary filling
     */
    public Message(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }
}
