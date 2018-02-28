package ru.job4j.array;

/**
 * Перевернуть массив.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 27.02.2018
 */

public class Turn {
    /**
     * Перевернуть массив.
     * @param array - массив для переворота.
     * @return перевернутый массив.
     */
    public int[] back(int[] array){
        int leng = array.length - 1;
        for(int i = 0; i <= leng; i++){
            int a = array[i];
            array[i] = array[leng];
            array[leng] = a;
            leng--;
        }
        return array;
    }
}
