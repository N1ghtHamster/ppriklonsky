package ru.job4j.array;

/**
 * Проверка, что слово начинается с определенной последовательности.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 28.02.2018
 */

public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }
    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
            for(int i =0; i < value.length; i++){
                if (value[i] != data[i]) {
                    result = false;
                }
            }
        return result;
    }
}
