package ru.job4j.array;

/**
 * Перевернуть массив целых чисел.
 */
public class Turn {
    /**
     * @param array массив целых чисел.
     * @return вернуть отредактированный массив.
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }
}
