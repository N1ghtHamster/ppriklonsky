package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TestQuestionTest {

    @Test
    public void whenTwoMassPlusThirdThenSortMass() {
        int [] arr = {1, 4, 7, 8, 9, 30};
        TestQuestion array = new TestQuestion();
        int [] rsl = array.testquestion(arr);
        int [] ex = {0, 1, 1, 3, 4, 5, 7, 8, 9, 9, 10, 11, 12, 30, 54, 86, 87, 95, 100};
        assertThat(rsl, is(ex));

    }

}