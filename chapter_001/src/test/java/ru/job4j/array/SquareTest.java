package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Заполнить массив степенями чисел. Тест.
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 27.02.2018
 */
public class SquareTest {
    @Test
    public void whenSquareToFive(){
        Square square = new Square();
        int[] rsl = square.calculate(5);
        int[] expect = {1, 4, 9, 16, 25};
        assertThat(rsl, is(expect));
    }
}
