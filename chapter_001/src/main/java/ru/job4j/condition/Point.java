package ru.job4j.condition;

import static java.lang.Math.sqrt;

/**
 * Расстояние между точками в системе координат.
 */
public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Формула поиска расстояния между точками.
     *
     * @return вернуть расстояние между точками.
     */

    public double distance(Point that) {
        return sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2));
    }
}
