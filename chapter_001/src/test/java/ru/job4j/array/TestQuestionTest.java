package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TestQuestionTest {
    @Test
    public void whenTwoMassPlusThirdThenSortMass() {
        int[] first = {0, 3, 10, 11, 86, 95, 100};
        int[] second = {1, 5, 9, 12, 54, 87};
        TestQuestion array = new TestQuestion();
        int[] rsl = array.question(first, second);
        int[] ex = {0, 1, 3, 5, 9, 10, 11, 12, 54, 86, 87, 95, 100};
        assertThat(rsl, is(ex));

    }

}