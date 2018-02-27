package ru.job4j.array;

/**
 * Заполнить массив степенями чисел.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 27.02.2018
 */
public class Square {
    /**
     * Конструктор массива заполненный возыеденными в спепень числами.
     * @param bound - размер массива.
     * @return Заполненный массив.
     */
    public int[] calculate(int bound) {
        int[] rsl = new int[bound];
        int cal = 1;
        for (int i = 0; i < rsl.length; i++) {
            cal *= 2;
            rsl[i] = cal;
        }
        return rsl;
    }
}
