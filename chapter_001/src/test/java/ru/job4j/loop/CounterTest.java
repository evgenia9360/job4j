package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int start = 5;
        int finish = 12;
        int expected = 36;
        int out = counter.add(start, finish);
        Assert.assertEquals(expected, out);
    }
}