package ru.job4j.tracker;

import javafx.scene.chart.PieChart;
import ru.job4j.tracker.models.*;

import java.util.Date;
import java.util.Random;

/**
 * Программа Заявки.
 * @author Priklonsky Pavel(votymu@yandex.ru)
 * @version 0.1
 */
public class Tracker {
    /**
     * Массив хранилише.
     */
    private Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой записи.
     */
    private int position = 0;
    private static final Random RN = new Random();

    /**
     * Метод добавления заявки в хранилище.
     * @param item новая заявка
     * @return
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }
    public void replace(String id, Item item) {

    }
    public void delete(String id) {

    }
    public Item[] findAll() {
       return ;
    }

    public Item[] findByName(String key) {
        return ;
    }
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
<<<<<<< HEAD
    String generateId() {
        return String.valueOf(new Date() + RN.next(100));
=======

    /**
     * Генерация уникального ключа для заявки.
     * @return
     */
    private String generateId() {
        return String.valueOf(RN.nextDouble());
>>>>>>> 546b14f7a632ffea025ad279a0ae5bd51d380ee1
    }
}
