package ru.job4j.condition;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    private static Triangle existsTriangle;
    private static Triangle notExistsTriangle;

    @BeforeClass
    public static void init() {
        existsTriangle = new Triangle(new Point(10, 1), new Point(1, 10), new Point(1, 1));
        notExistsTriangle = new Triangle(new Point(0, 1), new Point(0, 1), new Point(0, 1));
    }

    @Test
    public void period() {
        double result = existsTriangle.period(2.0, 2.0, 2.0);
        assertThat(3.0, is(result));
    }

    @Test
    public void area() {
        double result = existsTriangle.area();
        assertThat(40.5, is(result));
    }

    @Test
    public void areaTriangleNotExist() {
        double result = notExistsTriangle.area();
        assertThat(-1.0, is(result));
    }
}