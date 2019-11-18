package ru.job4j.array;

/**
 * Поиск минимального числа в массиве.
 */
public class Min {
    public static int findMin(int[] array) {
        /**
         * Проверяем числа в массиве с первого числа с индексом равным 0, сравниваем его следующим числом.
         *
         * @return минимальное число в массиве.
         */
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
