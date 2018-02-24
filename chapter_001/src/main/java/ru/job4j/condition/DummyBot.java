package ru.job4j.condition;

/**
 * Бот отвечающий на опребеленные вопросы.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 24.02.2018
 */

public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            // заменить "Привет, умник." на правильный ответ rsl = "ответ по заданию".
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) { // заменить ... на проверку, что этот вопрос известен боту и он знает как на него ответить.
            // заменить "До скорой встречи." на правильный ответ rsl = "ответ по заданию".
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
