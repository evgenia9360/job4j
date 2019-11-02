package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        SqMax sqMax = new SqMax();
        int result = sqMax.max(5, 4, 8, 3);
        assertThat(result, is(8));
    }

    @Test
    public void whenSecondMax() {
        SqMax sqMax = new SqMax();
        int result = sqMax.max(1, 4, 2,3);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        SqMax sqMax = new SqMax();
        int result = sqMax.max(1, 4, 6,3);
        assertThat(result, is(6));
    }

    @Test
    public void whenForthMax() {
        SqMax sqMax = new SqMax();
        int result = sqMax.max(1, 1, 1, 2);
        assertThat(result, is(2));
    }
}