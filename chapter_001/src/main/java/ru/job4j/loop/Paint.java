package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Псевдографика пирамида.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 25.02.2018
 */
public class Paint {
    public String rightTrl(int height) {
        return this.loolBy(height,
                height,
                (row, column) -> row >= column);
    }
    public String leftTrl(int height) {
        return this.loolBy(height,
                height,
                (row, column) -> row >= height - column - 1);
    }
    public String pyramid(int height) {
        return this.loolBy(height,
                2 * height - 1,
                (row, column) ->row >= height - column - 1 && row + height - 1 >= column);
    }
    private String loolBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row =0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
