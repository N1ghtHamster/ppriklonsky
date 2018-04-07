package ru.job4j.models;

/**
 * Класс Доктор.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 */

public class Doctor extends Profession {
    private String diagnose;
    private Doctor(String name, String profession, String diagnoz) {
        this.name = name;
        this.profession = profession;
        this.diagnose = diagnoz;
    }
    private String medicate(Patient patient) {
        return diagnose;
    }
}