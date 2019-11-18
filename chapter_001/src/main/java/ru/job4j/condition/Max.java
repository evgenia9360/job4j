package ru.job4j.condition;

/**
 * Максимальное целое число.
 */
public class Max {
    /**
     * @param first  первое целое число.
     * @param second второе челое число.
     * @return вернуть максимальное целое число.
     */
    public static int max(int first, int second) {
        return first > second ? first : second;
    }
}
