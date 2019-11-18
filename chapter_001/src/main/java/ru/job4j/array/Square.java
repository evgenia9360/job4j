package ru.job4j.array;

/**
 * Заполнение массива элементами возведенными в квадрат.
 */
public class Square {
    /**
     * @param bound
     * @return массив с возведенными в квадрат элементами.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int i = 1; i <= bound; i++) {
            rst[i - 1] = (int) Math.pow(i, 2);
        }
        return rst;
    }
}
