package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] arr = {4, 1, 6, 2};
        Turn turn = new Turn();
        int[] res = turn.back(arr);
        int[] ex = {2, 6, 1, 4};
        assertThat(res, is(ex));
    }
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        Turn turn = new Turn();
        int[] res = turn.back(arr);
        int[] ex = {5, 4, 3, 2, 1};
        assertThat(res, is(ex));
    }
}