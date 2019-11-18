package ru.job4j.condition;

/**
 * Задаем боту ответы на вопросы.
 */
public class DummyBot {
    /**
     * @param question вопрос.
     * @return возвращаем правильный ответ на вопрос.
     */
    public static String answer(String question) {
        /**
         * Проверка знает ли бот вопрос и знает ли он на него ответ.
         */
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if (question.equals("Пока.")) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
