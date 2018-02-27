package ru.job4j.array;

/**
 * Заполнить массив степенями чисел.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 27.02.2018
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int cal = 1;
        for (int i = 0; i < rst.length; i++) {
            cal *= 2;
            rst[i] = cal;
        }
        return rsl;
    }
}
