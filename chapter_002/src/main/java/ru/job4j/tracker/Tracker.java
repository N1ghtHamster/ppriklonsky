package ru.job4j.tracker;

import ru.job4j.tracker.models.*;

import java.util.Random;

public class Tracker {
    private Item[] items = new Item[10];
    private int position = 0;
    private static final Random RN = new Random();

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }
    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
    String generateId() {
        return String.valueOf(RN.next(100));
    }
}
