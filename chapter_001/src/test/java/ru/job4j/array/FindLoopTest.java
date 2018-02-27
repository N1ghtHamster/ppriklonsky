package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {
    @Test
    public void whenSquareToFiveFindSixteen(){
        Square square = new Square();
        int[] sq = square.calculate(5);
        FindLoop findLoop = new FindLoop();
        int expect = findLoop.index(sq, 16);
        assertThat(expect, is(3));
    }
    @Test
    public void whenSquareToFiveFindNoFaund(){
        Square square = new Square();
        int[] sq = square.calculate(5);
        FindLoop findLoop = new FindLoop();
        int expect = findLoop.index(sq, 8);
        assertThat(expect, is(-1));
    }
}