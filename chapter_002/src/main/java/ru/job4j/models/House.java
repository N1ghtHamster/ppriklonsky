package ru.job4j.models;

/**
 * Класс Дом.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 */

public class House {
    private String size;
    private House(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
}
