package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] arr = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        ArrayDuplicate remove = new ArrayDuplicate();
        String[] rsl = remove.remove(arr);
        String[] ex = {"Привет", "Мир", "Супер"};
        assertThat(rsl, is(ex));
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
    }
}