package ru.job4j.array;

/**
 * Проверка, что массиф содержит одинаковые диоганальные занчения ячеек.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 24.05.2018
 */

public class MatrixCheck {

    /**
     * Проверяет. одинаковость содержания диоганальных ячек массива.
     * @param data префикс.
     * @return true или false
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i != data.length; i++) {
            if (data[0][0] != data[i][i]) {
                result = false;
            }
        }
        return result;
    }
}
