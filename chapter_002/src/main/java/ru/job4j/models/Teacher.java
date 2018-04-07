package ru.job4j.models;

/**
 * Класс Учитель.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 */

public class Teacher extends Profession {
    private Teacher(String name, String kurs){
        this.name = name;
        this.name = kurs;
    }
    private String teach(Student student) {
        return student.getKurs();
    }
}
