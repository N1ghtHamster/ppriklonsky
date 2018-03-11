package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringFindTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        StringFind word = new StringFind();
        boolean result = word.stringFind("Hello", "ll");
        assertThat(result, is(true));
    }
}