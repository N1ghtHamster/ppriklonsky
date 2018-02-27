package ru.job4j.array;

/**
 * Заполнить массив степенями чисел.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 27.02.2018
 */
class Square {
    /**
     * Конструктор массива заполненный возыеденными в спепень числами.
     * @param bound - размер массива.
     * @return Заполненный массив.
     */
    int[] calculate(int bound) {
        int[] rsl = new int[bound];
        for (int i = 1; i <= rsl.length; i++) {
            rsl[i - 1] = i * i;
        }
        return rsl;
    }
}
