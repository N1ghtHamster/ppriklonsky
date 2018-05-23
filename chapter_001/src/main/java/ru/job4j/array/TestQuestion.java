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
        int sIncrease = 0;
        for (int i = 0; i < merged.length; i++) {
            if (fIncrease > first.length - 1) {
                int f = second[sIncrease];
                merged[i] = f;
                sIncrease++;
            } else if (sIncrease > second.length - 1) {
                int s = first[fIncrease];
                merged[i] = s;
                fIncrease++;
            } else if (first[fIncrease] < second[sIncrease]) {
                int a = first[fIncrease];
                merged[i] = a;
                fIncrease++;
            } else {
                int b = second[sIncrease];
                merged[i] = b;
                sIncrease++;
            }
        }
        return merged;
    }
}
