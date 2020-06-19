package Task1;

/** RUS
 * Класс электронного письма, наследник Message. В качестве наполнения принимает только текст
 * @see Task1.Message
 */
/** ENG
 * Class of the email. Extends Message. As filling only text
 * @see Task1.Message
 */
public class MailMessage extends Message <String> {

    /** RUS
     * Создание электронного письма
     * @param from имя отправителя
     * @param to имя получателя
     * @param content текст письма
     */
    /** ENG
     * Constructs a email
     * @param from sender's name
     * @param to recipient's name
     * @param content text of the letter
     */
    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }
}
