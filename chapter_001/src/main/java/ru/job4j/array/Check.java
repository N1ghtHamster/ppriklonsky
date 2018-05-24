package ru.job4j.array;

/**
 * Проверка, что массиф содержит одинаковые занчения ячеек.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 24.05.2018
 */

public class Check {
    /**
     * Проверяет. одинаковость содержания ячек массива.
     * @param data префикс.
     * @return true или false
     */

    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i != data.length; i++) {
            if (data[0] == data[i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
