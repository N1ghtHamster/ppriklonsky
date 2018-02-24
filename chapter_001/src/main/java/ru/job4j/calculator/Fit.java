package ru.job4j.calculator;

/**
 * Ideal Fit.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $ID$
 * @since 24.02.2018
 */

public class Fit {

    private static final int manminus = 100;
    private static final int womanminus = 110;
    private static final double cof = 1.15;
    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        return (height - manminus) * cof;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        return (height - womanminus) * cof;
    }
}
