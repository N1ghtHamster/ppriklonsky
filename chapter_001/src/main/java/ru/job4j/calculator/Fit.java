package ru.job4j.calculator;

/**
 * Ideal Fit.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $ID$
 * @since 24.02.2018
 */

public class Fit {

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}
