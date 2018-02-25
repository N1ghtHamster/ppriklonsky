package ru.job4j.loop;

/**
 * Вычисление факториала.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 25.02.2018
 */

public class Board {
    /**
     * Нарисовать шахматную доску.
     * @param width - высота доски.
     * @param height - ширина доски.
     * @return строковое значение записаное в StringBuilder.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 1; i <= width; ++i) {
            for (int j = 1; j <= height; ++j) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((i + j)%2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}

