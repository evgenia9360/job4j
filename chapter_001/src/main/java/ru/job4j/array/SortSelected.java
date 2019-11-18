package ru.job4j.array;

/**
 * Сортировка данных в массиве.
 */
public class SortSelected {
    /**
     * Сортировка массива целых чисел в диапазоне от start до finish.
     *
     * @param data массив целых чисел.
     * @return отсортированный массив целых чисел.
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoop.indexOf(data, min, i, data.length);
            int tmp = data[i];
            data[i] = min;
            data[index] = tmp;
        }
        return data;
    }
}
