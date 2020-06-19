package Task1;

/** RUS
 * Класс сообщения о зачислении зарплаты, наследник Message. В качестве наполнения принимает целое число
 * @see Task1.Message
 */
/** ENG
 * Class of the payroll. Extends Message. As filling integer
 * @see Task1.Message
 */
public class Salary extends Message <Integer> {

    /** RUS
     * Создание сообщения о зачислении зарплаты
     * @param from имя отправителя
     * @param to имя получателя
     * @param content сумма зачисления
     */
    /** ENG
     * Constructs a payroll
     * @param from sender's name
     * @param to recipient's name
     * @param content salary amount
     */
    public Salary(String from, String to, int content) {
        super(from, to, content);
    }
}
