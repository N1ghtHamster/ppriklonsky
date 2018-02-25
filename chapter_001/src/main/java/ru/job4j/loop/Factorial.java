package ru.job4j.loop;

/**
 * Вычисление факториала.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 25.02.2018
 */

public class Factorial {
    /**
     * Вычисление факториала числа n.
     * @param n - число для вычисления факториала
     */
    public int fac(int n) {
        int factor = 0;
        if (n >= 0) {
            factor = 1;
            for (int i = 1; i<= n; ++i)
                factor *= i;
        }
        return factor;
    }
}
