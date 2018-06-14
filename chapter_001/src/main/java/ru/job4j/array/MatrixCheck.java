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
        boolean result1 = true;
        boolean result2 = true;
        for (int i = 1; i != data.length; i++) {
            int j = data.length - 1;
            if (data[0][0] != data[i][i]) {
                result1 = false;
            }
            if (data[j][0] != data[j - i][i]) {
                result2 = false;
            }
        }
        return result1 || result2;
    }
}
