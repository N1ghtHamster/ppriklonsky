package ru.job4j.models;

/**
 * Класс Студент.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 */

public class Student extends Profession {
    private String kurs;
    private Student(String name, String kurs){
        this.name = name;
        this.kurs = kurs;
    }
    public String getKurs() {
        return kurs;
    }
}
