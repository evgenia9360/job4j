package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMaxFirst() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxSecond() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenEqually() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
}