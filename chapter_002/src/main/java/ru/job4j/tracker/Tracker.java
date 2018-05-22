package ru.job4j.tracker;

import javafx.scene.chart.PieChart;
import ru.job4j.tracker.models.*;

import java.util.Date;
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
        return String.valueOf(new Date() + RN.next(100));
    }
}
