package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void manWeight() {
        int in = 110;
        double expected = 11.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        int in2 = 120;
        double expected2 = 11.5;
        double out2 = Fit.womanWeight(in2);
        Assert.assertEquals(expected2, out2, 0.01);
    }
}
