package ru.job4j.array;

/**
 * Найти минимальное целое число в диапазоне от start до finish.
 */
public class MinDiapason {
    /**
     * @param array  массив целых чисел.
     * @param start  начало диапазона для сравнения чисел.
     * @param finish конец диапазона для сравнения чисел.
     * @return минимальное число в диапазоне от start до finish.
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
