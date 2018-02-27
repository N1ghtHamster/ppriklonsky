package ru.job4j.array;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
    public void whenSquareToFive {
        Square square = new Square();
        int[] rsl = square.calculate(5);
        assertThat(rsl, is());
    }
}
