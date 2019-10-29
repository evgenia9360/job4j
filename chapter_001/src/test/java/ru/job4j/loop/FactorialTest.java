package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        Factorial factorial = new Factorial();
        int in = 5;
        int expected = 120;
        int out = factorial.calc(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        Factorial factorial = new Factorial();
        int in = 0;
        int expected = 1;
        int out = factorial.calc(in);
        Assert.assertEquals(expected, out);
    }
}