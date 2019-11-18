package ru.job4j.condition;

/**
 * Поиск максимального числа.
 */
public class SqMax {
    /**
     * Поиск максимального целого числа из переданных четырех.
     *
     * @param first  первое целое число.
     * @param second второе целое число.
     * @param third  третье целое число.
     * @param forth  четвертое целое число.
     * @return вернуть результат вычислений.
     */
    public static int max(int first, int second, int third, int forth) {
        if (first > second && first > third && first > forth) {
            return first;
        } else if (second > first && second > third && second > forth) {
            return second;
        } else if (third > first && third > second && third > forth) {
            return third;
        } else {
            return forth;
        }
    }
}
