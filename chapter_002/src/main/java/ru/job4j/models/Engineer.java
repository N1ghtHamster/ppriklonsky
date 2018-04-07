package ru.job4j.models;

/**
 * Класс Инжинер.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 */

public class Engineer extends Profession {
    private Engineer(String name, String profession){
        this.name = name;
        this.profession = profession;
    }
    private String build(House house) {
        return house.getSize();
    }
}
