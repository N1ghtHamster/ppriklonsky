package ru.job4j.models;

/**
 * Класс Профессии.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 */

public class Profession {
        public String name;
        public String profession;
        public Profession() {
        }
        public Profession(String name, String profession) {
                this.name = name;
                this.profession = profession;
        }
        public String getName() {
                return name;
        }
        public String getProfession() {
                return profession;
        }
}