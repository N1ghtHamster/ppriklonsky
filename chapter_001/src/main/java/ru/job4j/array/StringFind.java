package ru.job4j.array;

/**
 * Проверка, что одно слово находится в другом слове.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 08.03.2018
 */

public class StringFind {

    public boolean stringFind(String origin, String sub) {
        boolean result = false;

        char[] value = origin.toCharArray();
        char[] str = sub.toCharArray();

        for(int i = 0; i <= value.length - 1; i++) {
            if (value[i] == str[0]) {
                for (int j = 0; j < str.length; j++) {
                    result = true;
                    if (value[i + j] != str[j]) {
                        result = false;
                        break;
                    }
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }
}
