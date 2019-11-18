package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TwoArraysTest {

    @Test
    public void intersection() {
        TwoArrays twoArrays = new TwoArrays();
        int[] a = {1, 2, 3, 4, 5, 4};
        int[] b = {2, 3, 4};
        int[] expected = {2, 3, 4};
        Assert.assertArrayEquals(expected, twoArrays.intersection(a, b));
    }
}