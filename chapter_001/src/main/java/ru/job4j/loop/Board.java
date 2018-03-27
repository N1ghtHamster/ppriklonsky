package ru.job4j.loop;

/**
 * Псевдографика шахматная доска.
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
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}

