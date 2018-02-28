package ru.job4j.array;

/**
 * Сортировка массива.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 28.02.2018
 */

public class BubbleSort {
    /**
     * Метод сортировки массива алгаритмом метод пузырька.
     * @param array любой массив.
     * @return отсортированный массив
     */
    public int[] sotr(int[] array) {
        int leng = array.length - 1;
        for (int i = leng; i > 0; i--){
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int b = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = b;
                }
            }
        }
        return array;
    }
}
