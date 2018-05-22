package ru.job4j.tracker.models;

public class Task extends Item {

    /**
     * Конструктор класса Элемент.
     *
     * @param name        Имя элемента
     * @param description Описание
     * @param create
     */
    public Task(String name, String description, long create) {
        super(name, description, create);
    }
}
