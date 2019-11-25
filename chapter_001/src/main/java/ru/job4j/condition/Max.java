package ru.job4j.condition;

/**
 * Максимальное целое число.
 */
public class Max {
    /**
     * Определить максимальное число.
     *
     * @param first  первое целое число.
     * @param second второе целое число.
     * @return вернуть максимальное целое число.
     */
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Определить максимальное число.
     *
     * @param first  первое целое число.
     * @param second второе целое число.
     * @param third  третье целое число.
     * @return вернуть максимальное целое число.
     */
    public static int max(int first, int second, int third) {
        return Math.max(first, Math.max(second, third));
    }

    /**
     * Определить максимальное число.
     *
     * @param first  первое целое число.
     * @param second второе целое число.
     * @param third  третье целое число.
     * @param fourth четвертое целое число.
     * @return вернуть максимальное целое число.
     */
    public static int max(int first, int second, int third, int fourth) {
        return Math.max(first, Math.max(second, Math.max(third, fourth)));
    }
}
