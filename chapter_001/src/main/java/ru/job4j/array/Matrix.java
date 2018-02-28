package ru.job4j.array;

/**
 * Таблица умножения в двухмерном массиве.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 28.02.2018
 */

public class Matrix {
    /**
     * Создание двухмерного массива.
     * @param size - Размер таблицы.
     * @return заполенный двухмерный массив.
     */
    int[][] multiple(int size){
        int[][] arr = new int[size][size];
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
        return arr;
    }
}
