package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenFirstLessSecondLessThird() {
        Max maxim = new Max();
        int result1 = maxim.max(1, 4);
        int result2 = maxim.max(4, 3);
        int result = maxim.max(result1, result2);
        assertThat(result, is(4));
    }
}
