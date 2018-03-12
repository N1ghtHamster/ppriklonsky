package ru.job4j.calculator;

/**
 * Converter.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 24.02.2018
 */

public class Converter {

    /**
     *variable
     */
    private static final Integer rubletodollar = 60;
    private static final Integer rubletoeuro = 70;
    /**
     *Method rubleToEuro.
     * @param value - value.
     * @return euro.
     */
    public double rubleToEuro(int value) {
        return rubletoeuro / value;
    }
    /**
     * Method rubleToDollar.
     * @param value - value
     * @return dollar.
     */
    public double rubleToDollar(int value) {
        return rubletodollar / value;
    }
    /**
     * Method dollarToRuble.
     * @param value - value.
     * @return ruble.
     */
    public double dollarToRuble(int value) {
        return value * rubletodollar;
    }
    /**
     * Method euroToRuble.
     * @param value - value.
     * @return ruble.
     */
    public double euroToRuble(int value) {
        return value * rubletoeuro;
    }
}
