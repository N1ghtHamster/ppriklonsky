package ru.job4j.models;

/**
 * Проверка, что слово начинается с определенной последовательности.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 28.02.2018
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
}