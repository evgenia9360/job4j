package ru.job4j.condition;

/**
 * Площадь треугольника.
 */
public class TrgArea {
    /**
     * Поиск площади треугольника по формуле.
     *
     * @param a длинна стороны а - число с плавающей точкой.
     * @param b длинна стороны b - число с плавающей точкой.
     * @param c длинна стороны c - число с плавающей точкой.
     * @return вернуть площадь треугольника.
     */
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - a));
        return area;
    }

    /**
     * Вывод в консоль  с новой строки результат вычислений.
     *
     * @param args параметры.
     */
    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
