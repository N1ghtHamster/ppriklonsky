package ru.job4j.max;

/**
 * Максимум двух чисел
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 24.02.2018
 */

public class Max {
    /**
     * Сравнение двух чисел.
      * @param first - first.
     * @param second - second.
     * @return max из first и second.
     */
    public int max(int first, int second) {
        return (first > second)? first : second;
    }
}
