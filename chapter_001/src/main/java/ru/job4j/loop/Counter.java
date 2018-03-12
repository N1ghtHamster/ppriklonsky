package ru.job4j.loop;

/**
 * Подсчет суммы чётных чисел в диапазоне
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 24.02.2018
 */
public class Counter {
    /**
     * Вычисляет сумму чётных чисел из диапазона.
     * @param start - начало диапазона.
     * @param finish - конец диапазона.
     * @return Сумма чётных чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start ; i <= finish; i++) {
            if ((i % 2) == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
