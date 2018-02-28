package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        int[] arr = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        BubbleSort sort = new BubbleSort();
        int[] rsl = sort.sotr(arr);
        int[] ex = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(rsl, is(ex));
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
    }
}