package ru.job4j.condition;

/**
 * Площадь прямоугольника.
 */
public class SqArea {
    /**
     * Вычислить по известным параметрам длину и высоту прямоугольника. А потом вычислить площадь полученного прямоугольника.
     *
     * @param p периметр.
     * @param k коэффициент разницы сторон прямоугольника.
     * @return вернуть площадь прямоугольника.
     */
    public static double square(int p, int k) {
        int h = p / (2 * (k + 1));
        int l = h * k;
        int square = l * h;
        return square;
    }

    /**
     * Вывод в консоль с новой строки дробный результат вычислений.
     *
     * @param args параметры.
     */
    public static void main(String[] args) {
        double result1 = square(4, 1);
        double result2 = square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
    }
}
