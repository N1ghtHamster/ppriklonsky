package ru.job4j.calculator;

/**
 * Calculator.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 23.02.2018
 */

public class Calculator {
    /**
     *
     */
    private double result;

    /**
     * Method add.
     * @param first - first.
     * @param second -second.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Method minus.
     * @param first - first.
     * @param second - second.
     */
    public void minus(double first, double second) {
        this.result = first - second;
    }
    /**
     * Method multiply.
     * @param first - first.
     * @param second -second.
     */
    public void multiply(double first, double second) {
        this.result = first * second;
    }
    /**
     * Method divide.
     * @param first - first.
     * @param second - second.
     */
    public void divide(double first, double second) {
        this.result = first / second;
    }
    /**
     * Method getResult.
     * @return result.
     */
    public double getResult() {
        return this.result;
    }
}
