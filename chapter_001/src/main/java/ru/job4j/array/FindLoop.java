package ru.job4j.array;

/**
 * Поиск в массиве по значению и вывод индекса значения.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 27.02.2018
 */

class FindLoop {
    /**
     * Поиск индекса.
     * @param data массив.
     * @param el значение.
     * @return вывод индекса значения.
     */
    int index(int[] data, int el) {
        int rsl = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}
