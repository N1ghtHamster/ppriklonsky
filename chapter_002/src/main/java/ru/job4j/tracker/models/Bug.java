package ru.job4j.tracker.models;

public class Bug extends Item {

    /**
     * Конструктор класса Элемент.
     *
     * @param name        Имя элемента
     * @param description Описание
     * @param create
     */
    public Bug(String name, String description, long create) {
        super(name, description, create);
    }
}
