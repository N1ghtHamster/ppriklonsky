package ru.job4j.array;

import java.util.Arrays;

/**
 * Удаление дубликатов в массиве.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 01.03.2018
 */

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int leng = array.length - 1;
        String str;
        for (int i = 1; i <= leng; i++) {
            if (array[0].equals(array[i])) {
                str = array[i];
                for (int j = i; j <= leng - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[leng - 1] = str;
                break;
            }
        }
        return Arrays.copyOf(array, 3);
    }
}
