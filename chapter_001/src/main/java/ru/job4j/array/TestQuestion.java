package ru.job4j.array;

/**
 * Создание сортированного массива из 3 массивов.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 */

public class TestQuestion {

    private int[] first = {0, 3, 10, 11, 86, 95, 100};
    private int[] second = {1, 5, 9, 12, 54, 87};

    public int[] question(int [] array) {
        int [] tmp = new int[first.length + second.length + array.length];
        for (int i = 0; i < first.length; i++) {
            tmp[i] = first[i];
        }
        for (int i = 0; i < second.length; i++) {
            tmp[i + first.length] = second[i];
        }
        for (int i = 0; i < array.length; i++) {
            tmp[i + (first.length + array.length)] = array[i];
        }
        BubbleSort so = new BubbleSort();
        return so.sotr(tmp);
    }
}
