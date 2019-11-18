package ru.job4j.condition;

/**
 * Проверка существования треугольника.
 */
public class Triangle {
    /**
     * @param ab первая сторона треугольника - дробное число.
     * @param ac вторая сторона треугольника - дробное число..
     * @param bc третья сторона треугольника - дробное число..
     * @return вернуть true если треугольник существует, false - если нет.
     */
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
}
