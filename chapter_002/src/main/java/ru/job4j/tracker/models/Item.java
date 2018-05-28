package ru.job4j.tracker.models;
/**
 * Программа Заявки.
 * @author Priklonsky Pavel(votymu@yandex.ru)
 * @version 0.1
 */
public class Item {
    /**
     *
     */
    private String id;
    private String name;
    private String description;
    private long create;

    private Item() {
    }
    /**
     * Конструктор класса Элемент.
     * @param name Имя элемента
     * @param description Описание
     * @param create
     */
    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }
    /**
     * Получить имя.
     * @return
     */
    public String getName() {
        return this.name;
    }
    /**
     * Получить
     * @return
     */
    public String getDescription() {
        return description;
    }
    /**
     *
     * @return
     */
    public long getCreate() {
        return this.create;
    }
    /**
     * Получить Id
     * @return
     */
    public String getId() {
        return this.id;
    }
    /**
     * Указать Id
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
}
