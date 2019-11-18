package ru.job4j.condition;

/**
 * Максимальное целое число.
 */
public class MultiMax {
    /**
     * @param first  первое целое число.
     * @param second второе целое число.
     * @param third  третье целое число.
     * @return вернуть максимальное целое число из трех переданных чисел.
     */
    public int max(int first, int second, int third) {
        return first > second && first > third ? first : second > third && second > first ? second : third;
    }
}
