package ru.job4j.array;

/**
 * Поиск элемента в массиве.
 */
public class FindLoop {
    /**
     * Поиск элемента в массиве чисел.
     *
     * @param data массив целых чисел.
     * @param el   целое число.
     * @return вернуть элемент в массиве. Если элемента не существует, вернуть -1.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Поиск элемента в массиве чисел от начала (start) до конца (finish) массива.
     *
     * @param data   массив целых чисел.
     * @param el     целое число.
     * @param start  начало действий.
     * @param finish конец действий.
     * @return вернуть элемент в массиве. Если элемента не существует, вернуть -1.
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (el == data[i]) {
                return i;
            }
        }
        return rst;
    }
}
