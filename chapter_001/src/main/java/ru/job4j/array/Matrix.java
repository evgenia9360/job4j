package ru.job4j.array;

/**
 * Матрица из двух массивов целых чисел.
 */
public class Matrix {
    /**
     * Создание и заполнение таблицы элементами.
     *
     * @param size размер таблицы.
     * @return вернуть заполненную элементами таблицу.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
