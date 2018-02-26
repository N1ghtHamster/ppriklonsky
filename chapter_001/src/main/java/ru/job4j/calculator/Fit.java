package ru.job4j.calculator;

/**
 * Ideal Fit.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $ID$
 * @since 24.02.2018
 */

public class Fit {

    private static final int MAN_MINUS = 100;
    private static final int WOMAN_MINUS = 110;
    private static final double COF = 1.15;
    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        return (height - MAN_MINUS) * COF;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        return (height - WOMAN_MINUS) * COF;
    }
}
