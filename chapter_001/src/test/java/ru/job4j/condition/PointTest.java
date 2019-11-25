package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance() {
        Point point = new Point(0, 1);
        Point point2 = new Point(0, 2);
        assertThat(1.0, is(point.distance(point2)));
    }

    @Test
    public void distance3d() {
        Point point = new Point(0, 0, 1);
        Point point2 = new Point(0, 0, 2);
        assertThat(1.0, is(point.distance3d(point2)));
    }
}