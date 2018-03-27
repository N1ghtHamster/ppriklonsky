package ru.job4j.array;

/**
 * Создание сортированного массива из 2 массивов.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 */

public class TestQuestion {
    public int[] question(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int fIncrease = 0;
        int sIncrease = 1;
        for (int i = 0; i < selection(first.length, second.length); i++) {
            if (first.length == second.length) {
                if (first [i] < second [i]) {
                    merged [i + fIncrease] = first [i];
                    merged [i + sIncrease] = second [i];
                    fIncrease += 1;
                    sIncrease += 1;
                } else {
                    merged [i + fIncrease] = second [i];
                    merged [i + sIncrease] = first [i];
                    fIncrease += 1;
                    sIncrease += 1;
                }
            }
        }
        return merged;
    }
    private int selection(int a, int b) {
        int select;
        if (a < b) {
            select = a;
        } else {
            select = b;
        }
        if (a == b) {
            select = a;
        }
        return select;
    }
}
